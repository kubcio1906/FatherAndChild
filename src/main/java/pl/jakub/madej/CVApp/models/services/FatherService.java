package pl.jakub.madej.CVApp.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;
import pl.jakub.madej.CVApp.models.form.FatherForm;
import pl.jakub.madej.CVApp.models.respositories.FamilyRespository;
import pl.jakub.madej.CVApp.models.respositories.FatherRespository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
public class FatherService {
    @Autowired
    FatherRespository fatherRespository;

    public void addFatherToDB(FatherForm fatherForm){
        FatherEntity newFather = new FatherEntity();
        newFather.setFirstName(fatherForm.getFirstName());
        newFather.setSecondName(fatherForm.getSecondName());
        newFather.setBirthDate(fatherForm.getBirthDate());
        newFather.setPesel(fatherForm.getPesel());
        fatherRespository.save(newFather);

    }


}
