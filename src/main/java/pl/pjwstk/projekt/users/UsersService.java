package pl.pjwstk.projekt.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    private final UsersRepository usersRepository;
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
}
