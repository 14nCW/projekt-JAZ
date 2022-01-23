package pl.pjwstk.projekt.formula.drivers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjwstk.projekt.formula.information.Information;

@Repository
public interface DriversJpaRepository extends JpaRepository<Drivers, Long>{
}
