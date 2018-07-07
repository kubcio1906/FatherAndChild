package pl.jakub.madej.CVApp.models.services;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReadFather {

    public List<FatherEntity> fatherEntityList(){

        List<FatherEntity> fatherEntities = new ArrayList<>();
        fatherEntities.add(new FatherEntity());
        return fatherEntities;
    }
}
