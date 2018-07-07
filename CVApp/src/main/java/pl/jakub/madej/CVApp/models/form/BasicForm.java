package pl.jakub.madej.CVApp.models.form;

public class BasicForm {
    private String firstName;

    public BasicForm(String firstName) {
        this.firstName = firstName;
    }

    public BasicForm() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
