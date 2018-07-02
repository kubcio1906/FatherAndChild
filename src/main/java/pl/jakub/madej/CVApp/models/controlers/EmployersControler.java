package pl.jakub.madej.CVApp.models.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.jakub.madej.CVApp.models.form.Employers;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployersControler {

    @RequestMapping("employersList")
    @ResponseBody
    public List<Employers> employersList(){

        List<Employers> employers = new ArrayList<Employers>() ;
        employers.add(new Employers("Jakub","Madej",23));
        employers.add(new Employers("Jakub","Ed",25));
        employers.add(new Employers("Jakub","MADSDASda",13));

        return employers;
    }
}
