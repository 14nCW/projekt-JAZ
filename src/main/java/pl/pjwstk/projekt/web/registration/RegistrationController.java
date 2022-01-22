package pl.pjwstk.projekt.web.registration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class RegistrationController {

    private RegistrationSecrvice registrationSecrvice;

    public String register(@RequestBody RegistrationRequest request) {
        return registrationSecrvice.register(request);
    }
}
