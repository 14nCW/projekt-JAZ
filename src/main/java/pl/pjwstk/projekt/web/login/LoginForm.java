package pl.pjwstk.projekt.web.login;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {

    private String username;
    private String password;

    public LoginForm() {
        super();
    }
}
