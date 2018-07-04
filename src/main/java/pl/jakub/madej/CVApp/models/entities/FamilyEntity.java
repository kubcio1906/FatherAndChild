package pl.jakub.madej.CVApp.models.entities;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "tfamily")
@Data
public class FamilyEntity {
    @Id
    @GeneratedValue
    @NonNull
    private int id;
    @Column(name = "father_id")
    private int fatherId;

    public FamilyEntity(int id) {
        this.id = id;
    }

    public FamilyEntity() {

    }

    public int getId() {
        return id;
    }

}
