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
    private String firstName;
    @Type(type="com.hibernate.samples.type.LocalDateTimeUserType")
    @Column(name = "birth_date")

    private LocalDateTime birthDate;
    private String secondName;
    private String pesel;

    public FatherEntity(String firstName, LocalDateTime birthDate, String secondName, String pesel) {
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

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
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
