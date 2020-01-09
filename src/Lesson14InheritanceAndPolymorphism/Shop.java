package Lesson14InheritanceAndPolymorphism;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Cashier> cashiers;
    private ArrayList<Manager> managers;
    private ArrayList<Guard> guards;

    public Shop(ArrayList<Cashier> cashiers, ArrayList<Manager> managers, ArrayList<Guard> guards) {
        this.cashiers = cashiers;
        this.managers = managers;
        this.guards = guards;
    }
}
