package pl.pjwstk.projekt;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Welcome home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome home admin";
    }
}
