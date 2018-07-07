package pl.jakub.madej.CVApp.models.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jakub.madej.CVApp.models.entities.ChildEntity;
import pl.jakub.madej.CVApp.models.entities.FamilyEntity;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface FamilyRespository extends CrudRepository<FamilyEntity,Integer> {


}
