package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;

import java.util.List;
import java.util.Optional;
@Repository
public interface ChildRespository extends CrudRepository<ChildEntity,Integer> {

   ChildEntity findByFirstName (String firstName);

}
