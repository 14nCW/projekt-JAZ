package pl.pjwstk.projekt.web.authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.*;
import pl.pjwstk.projekt.web.users.Users;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ApplicationUserDao extends JpaRepository<Users, Long> {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
