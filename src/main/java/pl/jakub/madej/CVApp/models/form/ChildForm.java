package pl.jakub.madej.CVApp.models.form;

import lombok.Data;

@Data
public class ChildForm {
    private String firstName;
    private String sex;
    private String secondName;
    private String pesel;

    public ChildForm(String firstName, String sex, String secondName, String pesel) {
        this.firstName = firstName;
        this.sex = sex;
        this.secondName = secondName;
        this.pesel = pesel;
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
