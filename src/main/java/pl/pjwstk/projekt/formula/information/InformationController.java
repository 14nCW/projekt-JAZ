package pl.pjwstk.projekt.formula.information;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
//@RequestMapping(path = "/information")
public class InformationController {

    @Autowired
    private final InformationService informationService;

    @GetMapping("information/{id}")
    public String showInformationPage(@PathVariable(value = "id") long id, Model model){
        Information information = informationService.getInformationById(id);

        model.addAttribute("information", information);

        return "information";
    }

    @GetMapping("/")
    public String showIndexInformationPage(Model model){
        model.addAttribute("information", informationService.getInformationList());

        return "index";
    }


}
