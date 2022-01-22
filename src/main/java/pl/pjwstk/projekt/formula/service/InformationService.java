package pl.pjwstk.projekt.formula.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjwstk.projekt.formula.entity.Information;
import pl.pjwstk.projekt.formula.repository.InformationJpaRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class InformationService {

    private final InformationJpaRepository informationJpaRepository;

    public List<Information> getInformation() {
        return informationJpaRepository.findAll();
    };
}
