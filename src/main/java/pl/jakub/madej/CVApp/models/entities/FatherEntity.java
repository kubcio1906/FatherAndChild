package pl.jakub.madej.CVApp.models.entities;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="t_father")
@Data
public class FatherEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "pesel")
    private String pesel;
//    @Column(name = "family_id")
//    private int familyId;

    public FatherEntity(String firstName, String birthDate, String secondName, String pesel) {
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.secondName = secondName;
        this.pesel = pesel;
    }

    public FatherEntity() {

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
