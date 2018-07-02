package pl.jakub.madej.CVApp.models.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.form.ChildForm;
import pl.jakub.madej.CVApp.models.respositories.ChildRespository;

@Service

public class ChildService {

    @Autowired
    ChildRespository childRespository;

    public boolean addChildToDB(ChildForm childForm){
        ChildEntity newChild = new ChildEntity();
        newChild.setFirstName(childForm.getFirstName());
        newChild.setSecondName(childForm.getSecondName());
        newChild.setSex(childForm.getSex());
        newChild.setPesel(childForm.getPesel());
        childRespository.save(newChild);


        return true;

    }
}
