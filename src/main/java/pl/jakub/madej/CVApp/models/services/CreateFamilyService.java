package pl.jakub.madej.CVApp.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakub.madej.CVApp.models.entities.FamilyEntity;
import pl.jakub.madej.CVApp.models.form.ChildForm;
import pl.jakub.madej.CVApp.models.form.FatherForm;
import pl.jakub.madej.CVApp.models.respositories.FamilyRespository;

@Service
public class CreateFamilyService {
    @Autowired
    FamilyRespository familyRespository;


    public Integer createFamily(){
        FamilyEntity familyEntity = new FamilyEntity();
        return familyEntity.getId();
    }
    public void addFamily(){
        FamilyEntity familyEntity =new FamilyEntity();
        familyEntity.setId(1);
    }

}
