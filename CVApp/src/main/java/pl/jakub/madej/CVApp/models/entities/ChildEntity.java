package pl.jakub.madej.CVApp.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity
@Table(name="t_child")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChildEntity {

        @Id
        @GeneratedValue
        private int id;
        private String firstName;
        private String sex;
        private String secondName;
        private String pesel;
        @Column(name = "father_id")
       private int fatherId;

        public ChildEntity( String firstName, String sex, String secondName, String pesel) {

                this.firstName = firstName;
                this.sex = sex;
                this.secondName = secondName;
                this.pesel = pesel;


        }


        public ChildEntity() {

        }

    @Override
    public String toString() {
        return "ChildEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                ", secondName='" + secondName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", fatherId=" + fatherId +
                '}';
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

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getSex() {
                return sex;
        }

        public void setSex(String sex) {
                this.sex = sex;
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
