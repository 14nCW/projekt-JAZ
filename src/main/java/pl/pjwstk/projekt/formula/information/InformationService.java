package pl.pjwstk.projekt.formula.information;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
