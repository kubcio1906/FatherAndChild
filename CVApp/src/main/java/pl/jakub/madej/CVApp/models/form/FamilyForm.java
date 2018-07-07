package pl.jakub.madej.CVApp.models.form;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class FamilyForm {
    @Id
    @GeneratedValue
    private int id;
    private int fatherId;

    public int getId() {
        return id;
    }

    public int getFatherId() {
        return fatherId;
    }
}
