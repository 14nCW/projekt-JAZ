package pl.pjwstk.projekt.web.login;

import lombok.AllArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Service;
import pl.pjwstk.projekt.formula.information.Information;
import pl.pjwstk.projekt.web.appUser.AppUser;
import pl.pjwstk.projekt.web.appUser.AppUserRepository;
import pl.pjwstk.projekt.web.appUser.AppUserService;

import java.util.Optional;

@AllArgsConstructor
@Service
public class LoginService {

    private final AppUserRepository appUserRepository;

    public AppUser getUserByUsername(String username) {
        Optional<AppUser> optional = appUserRepository.findByUsername(username);

        AppUser appUser;
        if(optional.isPresent()){
            appUser = optional.get();
        }
        else {
            throw new RuntimeException("Information not found for id: "+ username);
        }
        return appUser;
    };
}
