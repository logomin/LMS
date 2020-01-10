package Lesson14InheritanceAndPolymorphism;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Cashier> cashiers;
    private ArrayList<Manager> managers;
    private ArrayList<Guard> guards;
    private ArrayList<Client> clients;

    public Shop(ArrayList<Cashier> cashiers, ArrayList<Manager> managers,
                ArrayList<Guard> guards, ArrayList<Client> clients) {
        this.cashiers = cashiers;
        this.managers = managers;
        this.guards = guards;
        this.clients = clients;
    }

    public ArrayList<Cashier> getCashiers() {
        return cashiers;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Guard> getGuards() {
        return guards;
    }
}
