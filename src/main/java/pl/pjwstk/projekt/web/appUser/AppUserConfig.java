package pl.pjwstk.projekt.web.appUser;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import pl.pjwstk.projekt.formula.information.Information;
//import pl.pjwstk.projekt.formula.information.InformationJpaRepository;
import pl.pjwstk.projekt.web.security.PasswordEncoder;

import java.util.List;

@Configuration
@AllArgsConstructor
public class AppUserConfig{

private final PasswordEncoder passwordEncoder;

    @Bean
    CommandLineRunner userImport(AppUserRepository appUserRepository) {
        return args -> {
            AppUser usrone = new AppUser(
                    "canalsian",
                    "canals.ian@gmail.com",
                    passwordEncoder.bCryptPasswordEncoder().encode("haslo"),
                    AppUserRole.ADMIN
            );

            AppUser usertwo = new AppUser(
                    "a",
                    "canals.ian@gmail.com",
                    passwordEncoder.bCryptPasswordEncoder().encode("a"),
                    AppUserRole.ADMIN
            );

            appUserRepository.saveAll(
                    List.of(usrone, usertwo));
        };
    }
}
