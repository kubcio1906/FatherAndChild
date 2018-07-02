package pl.jakub.madej.CVApp.models.form;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class FatherForm {
  //  private int id;
    private String firstName;
    private LocalDateTime birthDate;
    private String secondName;
    private String pesel;

  public FatherForm(String firstName, LocalDateTime birthDate, String secondName, String pesel) {
    this.firstName = firstName;
    this.birthDate = birthDate;
    this.secondName = secondName;
    this.pesel = pesel;
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
