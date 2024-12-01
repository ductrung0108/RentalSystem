package record;

import person.Tenant;
import property.Property;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class RentalAgreement {
    private String id = UUID.randomUUID().toString();;
    private Property property;
    private AgreementPeriod period;
    private Date contractDate;
    private double rentingFee;
    private RentalStatus status;
    private Tenant tenant;
    private ArrayList<Tenant> subTenants;

    RentalAgreement() {}

    RentalAgreement(AgreementPeriod period, Date contractDate, double rentingFee, RentalStatus status) {
        this.period = period;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.status = status;
    }

    RentalAgreement(Property property, AgreementPeriod period, Date contractDate,
                    double rentingFee, Tenant tenant, RentalStatus status,
                    ArrayList<Tenant> subTenants) {
        this.property = property;
        this.period = period;
        this.contractDate = contractDate;
        this.rentingFee = rentingFee;
        this.tenant = tenant;
        this.status = status;
        this.subTenants = subTenants;
    }

    public String getId() {
        return id;
    }

    public Property getProperty() {
        return property;
    }

    public boolean setProperty(Property property) {
        try {
            this.property = property;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public AgreementPeriod getPeriod() {
        return period;
    }

    public boolean setPeriod(AgreementPeriod period) {
        try {
            this.period = period;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public boolean setContractDate(Date contractDate) {
        try {
            this.contractDate = contractDate;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public double getRentingFee() {
        return rentingFee;
    }

    public boolean setRentingFee(double rentingFee) {
        try {
            this.rentingFee = rentingFee;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public boolean setStatus(RentalStatus status) {
        try {
            this.status = status;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public boolean setTenant(Tenant tenant) {
        try {
            this.tenant = tenant;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Tenant> getSubTenants() {
        return subTenants;
    }

    public boolean setSubTenants(ArrayList<Tenant> subTenants) {
        try {
            this.subTenants = subTenants;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String subtenantsString = "";
        for (int i = 0; i < subTenants.size(); i++) {
            String tab = (i == subTenants.size() - 1) ? "" : "\t";
            subtenantsString += subTenants.get(i).getId() + tab;
        }

        return id + "\t" +
                property.getId() + "\t" +
                period + "\t" +
                contractDate + "\t" +
                rentingFee + "\t" +
                status + "\t" +
                tenant.getId() + "\t\t" +
                subtenantsString;
    }
}
