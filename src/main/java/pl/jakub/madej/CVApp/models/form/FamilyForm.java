package pl.jakub.madej.CVApp.models.form;

public class FamilyForm {
    private String familyName;

    public FamilyForm(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
