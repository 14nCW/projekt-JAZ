package pl.pjwstk.projekt.formula.information;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class InformationService {

    private final InformationJpaRepository informationJpaRepository;

    public Information getInformationById(long id) {
        Optional<Information> optional = informationJpaRepository.findById(id);

        Information information;
        if(optional.isPresent()){
            information = optional.get();
        }
        else {
            throw new RuntimeException("Information not found for id: "+ id);
        }
        return information;
    };

    public List<Information> getInformationList() {
        return informationJpaRepository.findAll().stream().toList();
    }
}
