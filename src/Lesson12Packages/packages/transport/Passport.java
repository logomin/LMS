package Lesson12Packages.packages.transport;

public class Passport {
    public String model;
    public int year;
    public int price;
    public String ownerName;

    public Passport changeOwner(String newOwnerName) {
        return PassportUtil.changeOwner(this, newOwnerName);
    }
}

