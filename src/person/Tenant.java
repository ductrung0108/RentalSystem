package person;

import java.util.ArrayList;
import java.util.Date;

import record.*;


public class Tenant extends Person {
    private ArrayList<RentalAgreement> rentalAgreements;
    private ArrayList<Payment> payments;

    Tenant(String fullName, Date dob, String contact) {
        super(fullName, dob, contact);
        this.rentalAgreements = new ArrayList<RentalAgreement>();
        this.payments = new ArrayList<Payment>();
    }

    Tenant(String fullName, Date dob, String contact, ArrayList<RentalAgreement> rentalAgreements, ArrayList<Payment> payments) {
        super(fullName, dob, contact);
        this.rentalAgreements = rentalAgreements;
        this.payments = payments;
    }

    public ArrayList<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public boolean setRentalAgreements(ArrayList<RentalAgreement> rentalAgreements) {
        try {
            this.rentalAgreements = rentalAgreements;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public boolean setPayments(ArrayList<Payment> payments) {
        try {
            this.payments = payments;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String rentalAgreementString = "";
        for (int i = 0; i < rentalAgreements.size(); i++) {
            String tab = "";
            if (i < rentalAgreements.size() - 1) {
                tab = "\t";
            }
            rentalAgreementString += rentalAgreements.get(i).getId() + tab;
        }

        String paymentsString = "";
        for (int i = 0; i < payments.size(); i++) {
            String tab = "";
            if (i < payments.size() - 1) {
                tab = "\t";
            }
            paymentsString += payments.get(i).getId() + tab;
        }

        return id + "\t" + fullName + "\t" + dob + "\t" + contact
                + "\t\t" + rentalAgreementString
                + "\t\t" + paymentsString;
    }
}
