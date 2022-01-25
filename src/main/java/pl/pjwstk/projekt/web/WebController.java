package pl.pjwstk.projekt.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pjwstk.projekt.web.appUser.AppUser;
import pl.pjwstk.projekt.web.appUser.AppUserRepository;
import pl.pjwstk.projekt.web.appUser.AppUserService;
import pl.pjwstk.projekt.web.login.LoginForm;
import pl.pjwstk.projekt.web.login.LoginService;
import pl.pjwstk.projekt.web.registration.RegistrationRequest;
import pl.pjwstk.projekt.web.registration.RegistrationService;

import java.util.List;

@Controller
@AllArgsConstructor
public class WebController {

    private final RegistrationService registrationService;
    private final LoginService loginService;
    private final AppUserService appUserService;
    private final AppUserRepository appUserRepository;

//    @GetMapping("/")
//    public String intex() {
//        return "index";
//    }

    @GetMapping(path = "/register")
    public String register(Model model) {
        model.addAttribute("user", new AppUser());
        return "register";
    }

    @GetMapping
    public String getUser(Model model) {
        model.addAttribute("user", new AppUser());
                return "index";
    }

    @PostMapping("/process_register")
    public String processRegistration(@ModelAttribute("user") AppUser appUser) {
        appUserRepository.save(appUser);
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String showLoginPage(){
        return "login";
    }
}