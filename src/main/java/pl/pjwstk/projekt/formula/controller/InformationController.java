package pl.pjwstk.projekt.formula.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjwstk.projekt.formula.entity.Information;
import pl.pjwstk.projekt.formula.service.InformationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/info")
public class InformationController {

    private final InformationService informationService;

    @GetMapping
    public List<Information> getinformation() {
        return informationService.getInformation();
    }
}
