package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakub.madej.CVApp.models.entities.FamilyEntity;


public interface FamilyRespository extends CrudRepository<FamilyEntity,Integer> {

}
