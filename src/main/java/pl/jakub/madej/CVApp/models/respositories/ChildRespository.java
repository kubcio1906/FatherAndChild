package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;

public interface ChildRespository extends CrudRepository<ChildEntity,Integer> {

}
