package pl.jakub.madej.CVApp.models.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jakub.madej.CVApp.models.form.FatherForm;
import pl.jakub.madej.CVApp.models.services.FatherService;

@Controller
public class AddFatherToFamily {
@Autowired
    FatherService fatherService;

    @GetMapping("addFather")
    public String addFather(){
        return "AddFather";
    }
    @PostMapping("addFather")
    public String addFather(Model model, @RequestParam("first_name") String firstName,
                                  @RequestParam("birth_date") String birthDate,
                                  @RequestParam("second_name") String secondName,
                                  @RequestParam("pesel") String pesel,
                                    @ModelAttribute FatherForm fatherForm){
        if(birthDate!=null) {

            fatherService.addFatherToDB(fatherForm);
            return "AddChild";
        }else{
            return "AddFather";
        }

    }
}
