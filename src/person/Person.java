package person;

import java.util.Date;
import java.util.UUID;

public abstract class Person {
    protected String id = UUID.randomUUID().toString();;
    protected String fullName;
    protected Date dob;
    protected String contact;

    Person (String fullName, Date dob, String contact) {
        this.fullName = fullName;
        this.dob = dob;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean setFullName(String fullName) {
        try {
            this.fullName = fullName;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public Date getDob() {
        return dob;
    }

    public boolean setDob(Date dob) {
        try {
            this.dob = dob;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public String getContact() {
        return contact;
    }

    public boolean setContact(String contact) {
        try {
            this.contact = contact;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}
