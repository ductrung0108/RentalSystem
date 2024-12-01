package person;

import java.util.ArrayList;
import java.util.Date;

import property.Property;

public class Owner extends Person {
    private ArrayList<Property> properties;

    Owner(String fullName, Date dob, String contact) {
        super(fullName, dob, contact);
        this.properties = new ArrayList<Property>();
    }

    Owner(String fullName, Date dob, String contact, ArrayList<Property> properties) {
        super(fullName, dob, contact);
        this.properties = properties;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public boolean setProperties(ArrayList<Property> properties) {
        try {
            this.properties = properties;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String propertiesString = "";
        for (int i = 0; i < properties.size(); i++) {
            String tab = "";
            if (i < properties.size() - 1) {
                tab = "\t";
            }
            propertiesString += properties.get(i).getId() + tab;
        }

        return id + "\t" + fullName + "\t" + dob + "\t" + contact
                + "\t\t" + propertiesString;
    }
}
