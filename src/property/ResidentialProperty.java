package property;

import person.Host;
import person.Owner;

import java.util.ArrayList;

public class ResidentialProperty extends Property {
    private int bedrooms;
    private int kitchens;
    private int livingrooms;
    private int bathrooms;
    private boolean garden;
    private boolean petFriendly;
    private FurnishingStatus furniture;
    private double area;

    ResidentialProperty(String address, double pricing, Owner owner,
                        ArrayList<Host> hosts, PropertyStatus status,
                        int bedrooms, int kitchens, int livingrooms, int bathrooms,
                        boolean garden, boolean petFriendly, FurnishingStatus furniture, double area) {
        super(address, pricing, owner, hosts, status);
        this.bedrooms = bedrooms;
        this.kitchens = kitchens;
        this.livingrooms = livingrooms;
        this.bathrooms = bathrooms;
        this.garden = garden;
        this.petFriendly = petFriendly;
        this.furniture = furniture;
        this.area = area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getKitchens() {
        return kitchens;
    }

    public int getLivingrooms() {
        return livingrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean isGarden() {
        return garden;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public FurnishingStatus getFurniture() {
        return furniture;
    }

    public double getArea() {
        return area;
    }

    public boolean setBedrooms(int bedrooms) {
        try {
            this.bedrooms = bedrooms;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setKitchens(int kitchens) {
        try {
            this.kitchens = kitchens;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setLivingrooms(int livingrooms) {
        try {
            this.livingrooms = livingrooms;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setBathrooms(int bathrooms) {
        try {
            this.bathrooms = bathrooms;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setGarden(boolean garden) {
        try {
            this.garden = garden;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setPetFriendly(boolean petFriendly) {
        try {
            this.petFriendly = petFriendly;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setFurniture(FurnishingStatus furniture) {
        try {
            this.furniture = furniture;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setArea(double area) {
        try {
            this.area = area;
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
                bedrooms + "\t" +
                kitchens + "\t" +
                livingrooms + "\t" +
                bathrooms + "\t" +
                garden + "\t" +
                petFriendly + "\t" +
                furniture + "\t" +
                area + "\t\t" +
                hostsString;
    }
}
