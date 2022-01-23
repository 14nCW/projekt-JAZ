package pl.pjwstk.projekt.formula.drivers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriversJpaRepository extends JpaRepository<Drivers, Long> {
}
