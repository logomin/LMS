package Lesson14InheritanceAndPolymorphism;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Cashier> cashiers = new ArrayList<Cashier>();
        cashiers.add(new Cashier());
        ArrayList<Manager> managers = new ArrayList<Manager>();
        managers.add(new Manager());
        ArrayList<Guard> guards = new ArrayList<Guard>();
        guards.add(new Guard());
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(new Client());

        Shop shop = new Shop(cashiers, managers, guards, clients);

        shop.getCashiers().get(0).comeToWork();
        shop.getManagers().get(0).comeToWork();
        shop.getGuards().get(0).comeToWork();
        shop.getClients().get(0).sayHello();
        shop.getClients().get(0).askAboutGoods();
        shop.getManagers().get(0).consult();
        shop.getClients().get(0).buy();
        shop.getCashiers().get(0).doingWork();
        shop.getGuards().get(0).doingWork();
        shop.getClients().get(0).sayGoodbye();
        shop.getCashiers().get(0).goToLunch();
        shop.getManagers().get(0).goToLunch();
        shop.getGuards().get(0).goToLunch();
        System.out.println("--------------------------");
        System.out.println("equals");
        System.out.println(shop.getCashiers().get(0).equals("2"));
        System.out.println(shop.getManagers().get(0).equals("2"));
        System.out.println(shop.getGuards().get(0).equals("2"));
        System.out.println("hashcode");
        System.out.println(shop.getCashiers().get(0).hashCode());
        System.out.println(shop.getManagers().get(0).hashCode());
        System.out.println(shop.getGuards().get(0).hashCode());
        System.out.println("toString");
        System.out.println(shop.getCashiers().get(0).toString());
        System.out.println(shop.getManagers().get(0).toString());
        System.out.println(shop.getGuards().get(0).toString());
    }
}
