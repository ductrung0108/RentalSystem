package property;

import person.Host;
import person.Owner;

import java.util.ArrayList;

public class CommercialProperty extends Property {
    private String businessType;
    private int squareFootage;
    private int parkingSpaces;
    private String zoningType;
    private boolean hasLoadingDock;
    private int floorLevel;
    private boolean hvacAvailable;

    CommercialProperty(String address, double pricing, Owner owner, ArrayList<Host> hosts, PropertyStatus status,
                       String businessType, int squareFootage, int parkingSpaces, String zoningType,
                       boolean hasLoadingDock, int floorLevel, boolean hvacAvailable) {
        super(address, pricing, owner, hosts, status);
        this.businessType = businessType;
        this.squareFootage = squareFootage;
        this.parkingSpaces = parkingSpaces;
        this.zoningType = zoningType;
        this.hasLoadingDock = hasLoadingDock;
        this.floorLevel = floorLevel;
        this.hvacAvailable = hvacAvailable;
    }

    public String getBusinessType() {
        return businessType;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public String getZoningType() {
        return zoningType;
    }

    public boolean isHasLoadingDock() {
        return hasLoadingDock;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public boolean isHvacAvailable() {
        return hvacAvailable;
    }

    public boolean setBusinessType(String businessType) {
        try {
            this.businessType = businessType;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setSquareFootage(int squareFootage) {
        try {
            this.squareFootage = squareFootage;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setParkingSpaces(int parkingSpaces) {
        try {
            this.parkingSpaces = parkingSpaces;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setZoningType(String zoningType) {
        try {
            this.zoningType = zoningType;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setHasLoadingDock(boolean hasLoadingDock) {
        try {
            this.hasLoadingDock = hasLoadingDock;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setFloorLevel(int floorLevel) {
        try {
            this.floorLevel = floorLevel;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setHvacAvailable(boolean hvacAvailable) {
        try {
            this.hvacAvailable = hvacAvailable;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String hostsString = "";
        for (int i = 0; i < hosts.size(); i++) {
            String tab = "";
            if (i < hosts.size() - 1) {
                tab = "\t";
            }
            hostsString += hosts.get(i).getId() + tab;
        }

        return id + "\t" +
                address + "\t" +
                pricing + "\t" +
                owner.getId() + "\t" +
                status + "\t" +
                businessType + "\t" +
                squareFootage + "\t" +
                parkingSpaces + "\t" +
                zoningType + "\t" +
                hasLoadingDock + "\t" +
                floorLevel + "\t" +
                hvacAvailable + "\t\t" +
                hostsString;
    }
}
