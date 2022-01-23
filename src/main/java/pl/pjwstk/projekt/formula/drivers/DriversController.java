package pl.pjwstk.projekt.formula.drivers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjwstk.projekt.formula.information.Information;
import pl.pjwstk.projekt.formula.information.InformationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping
public class DriversController {
    private final DriversService driversService;
    private final InformationService informationService;

    @GetMapping(path = "/driver/{id}")
    public List<Drivers> getDrivers(@PathVariable("id") Long id) {
        return driversService.getDrivers();
    }
}
