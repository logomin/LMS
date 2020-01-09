package Lesson14InheritanceAndPolymorphism;

public class Cashier extends Employee {
    private int numberOfCashDesk;

    public void cashCount(){
        System.out.println("Считаю деньги");
    }

    @Override
    public void doingWork() {
        System.out.println("Делаю работу кассира");;
    }
}
