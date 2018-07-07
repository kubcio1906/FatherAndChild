package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.entities.FatherEntity;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface FatherRespository extends CrudRepository<FatherEntity,Integer> {
    List<FatherEntity> findByFirstName(String firstName);
    List<ChildEntity> child = new ArrayList<>();
}
