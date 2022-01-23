package pl.pjwstk.projekt.formula.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationJpaRepository extends JpaRepository<Information, Long> {
}
