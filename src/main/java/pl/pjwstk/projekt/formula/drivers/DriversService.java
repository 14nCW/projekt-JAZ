package pl.pjwstk.projekt.formula.drivers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjwstk.projekt.formula.information.InformationJpaRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DriversService {
    private final DriversJpaRepository driversJpaRepository;
    public List<Drivers> getDrivers() { return driversJpaRepository.findAll(); }
}
