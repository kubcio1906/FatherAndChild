package pl.jakub.madej.CVApp.models.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FatherForm {
  //  private int id;
    private String firstName;
    private String birthDate;
    private String secondName;
    private String pesel;

  public FatherForm(String firstName, String birthDate, String secondName, String pesel) {
    this.firstName = firstName;
    this.birthDate = birthDate;
    this.secondName = secondName;
    this.pesel = pesel;
  }

  public FatherForm() {

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
