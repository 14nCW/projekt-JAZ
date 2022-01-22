package pl.pjwstk.projekt.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HttpController {

    @GetMapping("login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("dupa")
    public String getDupa() {
        return "dupa";
    }
}
