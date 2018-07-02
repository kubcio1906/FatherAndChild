package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;

public interface FatherRespository extends CrudRepository<FatherEntity,Integer> {
}
