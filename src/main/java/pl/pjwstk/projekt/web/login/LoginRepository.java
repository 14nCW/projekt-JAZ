package pl.pjwstk.projekt.web.login;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjwstk.projekt.web.appUser.AppUser;

public interface LoginRepository extends JpaRepository<AppUser, Long> {
}
