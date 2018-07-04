package pl.jakub.madej.CVApp.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.respositories.ChildRespository;

import java.util.Optional;

public class SearchChild {
    @Autowired
    ChildRespository childRespository;
    public Optional findChild(String firstName){
        Optional<ChildEntity> child = childRespository.findByFirstName(firstName);

        return child;
    }
}
