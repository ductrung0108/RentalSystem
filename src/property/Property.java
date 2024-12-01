package property;

import person.*;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Property {
    protected String id = UUID.randomUUID().toString();
    protected String address;
    protected double pricing;
    protected PropertyStatus status;
    protected Owner owner;
    protected ArrayList<Host> hosts;

    Property(String address, double pricing, Owner owner, ArrayList<Host> hosts, PropertyStatus status) {
        this.address = address;
        this.pricing = pricing;
        this.owner = owner;
        this.hosts = hosts;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        try {
            this.address = address;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public double getPricing() {
        return pricing;
    }

    public boolean setPricing(double pricing) {
        try {
            this.pricing = pricing;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Owner getOwner() {
        return owner;
    }

    public boolean setOwner(Owner owner) {
        try {
            this.owner = owner;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<Host> getHosts() {
        return hosts;
    }

    public boolean setHosts(ArrayList<Host> hosts) {
        try {
            this.hosts = hosts;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public PropertyStatus getStatus() {
        return status;
    }

    public boolean setStatus(PropertyStatus status) {
        try {
            this.status = status;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
