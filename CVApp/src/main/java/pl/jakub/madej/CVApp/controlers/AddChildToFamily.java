package pl.jakub.madej.CVApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jakub.madej.CVApp.models.form.ChildForm;
import pl.jakub.madej.CVApp.models.respositories.ChildRespository;
import pl.jakub.madej.CVApp.models.services.ChildService;
import pl.jakub.madej.CVApp.models.services.CreateFamilyService;

@Controller
public class AddChildToFamily {

    @Autowired
    ChildService childService;
    CreateFamilyService createFamilyService;
    AddFatherToFamily addFatherToFamily;
    @GetMapping("addChild")

    public String addChild(){
        return "AddChild";
    }

    @PostMapping(value="addChild")
    public String addChild(@RequestParam("first_name") String firstName,
                           @RequestParam("second_name") String secondName,
                           @RequestParam ("sex") String sex,
                           @RequestParam ("pesel") String pesel){


            ChildForm childForm = new ChildForm();
            childForm.setFirstName(firstName);
            childForm.setSecondName(secondName);
            childForm.setSex(sex);
            childForm.setPesel(pesel);
            childService.addChildToDB(childForm);
            return "AddChild";
    }
//    @PostMapping(value="addChild", params = "Create family")
//    @ResponseBody
//    public String createFamily(){
//
//        return"DONE";
//
//    }

}
