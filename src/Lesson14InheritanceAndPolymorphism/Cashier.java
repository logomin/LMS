package Lesson14InheritanceAndPolymorphism;

import java.util.Date;

public class Cashier extends Employee {
    private int numberOfCashDesk;

    public void cashCount(){
        System.out.println("Считаю деньги");
    }

    @Override
    public void doingWork() {
        System.out.println("Делаю работу кассира");;
    }

    public Cashier(String firstName, String secondName, String lastName, int phoneNumber, Date dateOfHire, float salary, boolean isAtWork, int numberOfCashDesk) {
        super(firstName, secondName, lastName, phoneNumber, dateOfHire, salary, isAtWork);
        this.numberOfCashDesk = numberOfCashDesk;
    }

    public Cashier() {
    }

    public int getNumberOfCashDesk() {
        return numberOfCashDesk;
    }

    public void setNumberOfCashDesk(int numberOfCashDesk) {
        this.numberOfCashDesk = numberOfCashDesk;
    }
}
