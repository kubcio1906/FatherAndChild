package pl.jakub.madej.CVApp.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity
@Table(name="t_child")
@Data
public class ChildEntity {

        @Id
        @GeneratedValue
        private int id;
        private String firstName;
        private String sex;
        private String secondName;
        private String pesel;
        @Column(name = "father_id")
        @GeneratedValue
        private int fatherId;

        public ChildEntity( String firstName, String sex, String secondName, String pesel) {

                this.firstName = firstName;
                this.sex = sex;
                this.secondName = secondName;
                this.pesel = pesel;


        }

        public ChildEntity() {

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
