package pl.pjwstk.projekt.formula.information;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InformationService {

    private final InformationJpaRepository informationJpaRepository;

    public List<Information> getInformation() {
        return informationJpaRepository.findAll();
    };

//    public String getTeamInformation(String name) {
//        return informationJpaRepository.findBy(name);
//    };
}
