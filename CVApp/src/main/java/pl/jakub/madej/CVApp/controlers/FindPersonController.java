package pl.jakub.madej.CVApp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.form.ChildForm;
import pl.jakub.madej.CVApp.models.respositories.ChildRespository;
import pl.jakub.madej.CVApp.models.services.ReadFamily;
import pl.jakub.madej.CVApp.models.services.ReadFather;

import java.util.HashMap;
import java.util.List;

@Controller
public class FindPersonController {

    private ReadFamily readFamily;

    @Autowired
    public FindPersonController(ReadFamily readFamily){
        this.readFamily=readFamily;
    }
    @GetMapping("findPersonResult")
    public String findPerson(Model model){
        model.addAttribute("childForm",new ChildForm());
        return"Find";
    }
    @PostMapping  ("findPersonResult")
    public String findPerson(Model model,
                             @RequestParam ("first_name") String firstName) {

            model.addAttribute("firstName",readFamily.findChild(firstName));

        return "Find";
    }



//    @RequestMapping (value = "findPerson/{firstName}", method = RequestMethod.GET)
//
//    public String find(@PathVariable ("firstName") String firstName,
//                       Model model){
//
//        if(readFamily.findChild(firstName)!=null){
//
//            model.addAttribute("name",readFamily.findChild(firstName).getFirstName());
//            model.addAttribute("secondName",readFamily.findChild(firstName).getSecondName());
//            model.addAttribute("pesel",readFamily.findChild(firstName).getPesel());
//            model.addAttribute("sex",readFamily.findChild(firstName).getSex());
//
//            return "Result";
//        }else{
//            model.addAttribute("Error","The person doesn't exist");
//
//            return "Find";
//        }

    }







