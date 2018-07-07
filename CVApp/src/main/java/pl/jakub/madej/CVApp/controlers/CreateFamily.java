package pl.jakub.madej.CVApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.jakub.madej.CVApp.models.services.CreateFamilyService;

@Controller
public class CreateFamily {
    @Autowired
    CreateFamilyService createFamilyService;


    @GetMapping("createFamily")

    public String showFamily(){
        createFamilyService.createFamily();
        return "Basic";
    }


}
