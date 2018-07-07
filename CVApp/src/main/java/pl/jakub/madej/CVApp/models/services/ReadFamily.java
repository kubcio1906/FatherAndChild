package pl.jakub.madej.CVApp.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.form.ChildForm;
import pl.jakub.madej.CVApp.models.respositories.ChildRespository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ReadFamily {

@Autowired
    ChildRespository childRespository;

public String findChild(String firstName){
    ChildForm childForm = new ChildForm();
    childForm.setFirstName(firstName);
    return childForm.getFirstName();

}

}
