package pl.pjwstk.projekt.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pjwstk.projekt.users.Users;
import pl.pjwstk.projekt.users.UsersRepository;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class UsersConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            UsersRepository repository) {
        return args -> {
            Users Adam = new Users(
                    "Adam",
                    "Bączkowski",
                    "baczkowski.adam@wp.pl",
                    "haslo123",
                    LocalDate.of(2000, AUGUST, 26),
                    true
            );

            Users Stanisław = new Users(
                    "Staś",
                    "Brzęczyszczykiewicz",
                    "b.staś@wp.pl",
                    "stanislawmistrz123",
                    LocalDate.of(2004, JANUARY, 5),
                    false
            );
            repository.saveAll(List.of(Adam, Stanisław));
        };
    }
}
