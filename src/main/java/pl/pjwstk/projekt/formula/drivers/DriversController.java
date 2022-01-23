package pl.pjwstk.projekt.formula.drivers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/info")
public class DriversController {
    private final DriversService driversService;

    @GetMapping(path = "/driver/{id}")
    public List<Drivers> getDrivers() {
        return driversService.getDrivers();
    }
}
