package record;

import person.Tenant;

import java.util.Date;
import java.util.UUID;

public class Payment {
    private String id = UUID.randomUUID().toString();
    private Tenant tenant;
    private double amount;
    private Date date;
    private RentalAgreement rentalAgreement;

    Payment() {}

    Payment(Tenant tenant, double amount, Date date, RentalAgreement rentalAgreement) {
        this.tenant = tenant;
        this.amount = amount;
        this.date = date;
        this.rentalAgreement = rentalAgreement;
    }

    Payment(double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public boolean setTenant(Tenant tenant) {
        try {
            this.tenant = tenant;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setAmount(double amount) {
        try {
            this.amount = amount;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setDate(Date date) {
        try {
            this.date = date;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setRentalAgreement(RentalAgreement rentalAgreement) {
        try {
            this.rentalAgreement = rentalAgreement;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + "\t" +
                tenant.getId() + "\t" +
                amount + "\t" +
                date + "\t" +
                rentalAgreement.getId();
    }
}
