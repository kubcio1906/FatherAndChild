package pl.jakub.madej.CVApp.models.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReadFather {
    @GetMapping("fatherList")
    @ResponseBody
    public List<FatherEntity> fatherEntityList(){

        List<FatherEntity> fatherEntities = new ArrayList<>();
        fatherEntities.add(new FatherEntity());
        return fatherEntities;
    }
}
