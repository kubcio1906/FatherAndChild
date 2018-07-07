package pl.jakub.madej.CVApp.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_family")
@Data
public class FamilyEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "father_id")
    private int fatherId;

    public FamilyEntity(int id) {
        this.id = id;
    }

    public FamilyEntity() {

    }

    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    public int getId() {
        return id;
    }

}
