package Lesson12Packages.packages.test;

import Lesson12Packages.packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport vehicle1 = new Passport();
        vehicle1.ownerName = "Vasya";
        System.out.println("Предыдущий владелец --- " + vehicle1.ownerName);
        //Passport vehicle2 = PassportUtil.changeOwner(vehicle1, "Petya");
        Passport vehicle2 = vehicle1.changeOwner("Petya");
        System.out.println("Нынешний владелец --- " + vehicle2.ownerName);
    }
}
