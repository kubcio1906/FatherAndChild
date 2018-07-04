package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;

import java.util.List;
import java.util.Optional;

public interface ChildRespository extends CrudRepository<ChildEntity,Integer> {

   // List<ChildEntity> findByFirstName(String firstName);
    Optional<ChildEntity> findByFirstName(String firstName) ;
}
