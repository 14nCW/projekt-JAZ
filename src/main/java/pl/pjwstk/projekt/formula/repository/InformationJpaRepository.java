package pl.pjwstk.projekt.formula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjwstk.projekt.formula.entity.Information;

@Repository
public interface InformationJpaRepository extends JpaRepository<Information, Long> {
}
