package rentalManagementSystem;

import java.util.ArrayList;

import person.*;
import property.*;
import record.*;


public interface RentalManager {
    public ArrayList<Tenant> getTenants(String keyword, int sortingMode);

    public boolean addTenant(Tenant tenant);

    public boolean updateTenant(Tenant tenant);

    public boolean deleteTenant(Tenant tenant);

    public ArrayList<Host> getHosts(String keyword, int sortingMode);

    public boolean addHost(Host host);

    public boolean updateHost(Host host);

    public boolean deleteHost(Host host);

    public ArrayList<Owner> getOwners(String keyword, int sortingMode);

    public boolean addOwner(Owner owner);

    public boolean updateOwner(Owner owner);

    public boolean deleteOwner(Owner owner);

    public ArrayList<ResidentialProperty> getResidentialProperties(String keyword, int sortingMode);

    public boolean addResidentialProperty(ResidentialProperty residentialProperty);

    public boolean updateResidentialProperty(ResidentialProperty residentialProperty);

    public boolean deleteResidentialProperty(ResidentialProperty residentialProperty);

    public ArrayList<CommercialProperty> getCommercialProperties(String keyword, int sortingMode);

    public boolean addCommercialProperty(CommercialProperty commercialProperty);

    public boolean updateCommercialProperty(CommercialProperty commercialProperty);

    public boolean deleteCommercialProperty(CommercialProperty commercialProperty);

    public ArrayList<RentalAgreement> getRentalAgreements(String keyword, int sortingMode);

    public boolean addRentalAgreement(RentalAgreement rentalAgreement);

    public boolean updateRentalAgreement(RentalAgreement rentalAgreement);

    public boolean deleteRentalAgreement(RentalAgreement rentalAgreement);

    public ArrayList<Payment> getPayments(String keyword, int sortingMode);

    public boolean addPayment(Payment payment);

    public boolean updatePayment(Payment payment);

    public boolean deletePayment(Payment payment);
}
