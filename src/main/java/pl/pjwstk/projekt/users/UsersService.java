package pl.pjwstk.projekt.users;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UsersService {
    public List<Users> getUsers() {
        return List.of(
                new Users(1L,
                        "Adam",
                        "Bączkowski",
                        "baczkowski.adam@dupa.pl",
                        "haslo123",
                        LocalDate.of(2000, Month.AUGUST, 26),
                        true)
        );
    }
}
