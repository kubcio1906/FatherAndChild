package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;

import java.util.List;

public interface FatherRespository extends CrudRepository<FatherEntity,Integer> {
    List<FatherEntity> findByFirstName(String firstName);
}
