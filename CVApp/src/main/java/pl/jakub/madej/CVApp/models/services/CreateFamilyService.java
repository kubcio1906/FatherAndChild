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
    FatherService fatherService;

    public Integer createFamily(){
        FamilyEntity familyEntity = new FamilyEntity();
        familyEntity.setFatherId(FatherService.idFather);
        familyRespository.save(familyEntity);
        return familyEntity.getId();
    }

}
