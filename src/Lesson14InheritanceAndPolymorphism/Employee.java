package Lesson14InheritanceAndPolymorphism;

import java.util.Date;

public class Employee extends Human {
    private Date dateOfHire;
    private float salary;
    private boolean isAtWork;

    public void comeToWork(){
        System.out.println("Пришел на работу");
    }

    public void goToLunch(){
        System.out.println("Пошел на обед");
    }

    public void doingWork(){
        System.out.println("Делаю работу");
    }

    public Employee(String firstName, String secondName, String lastName, int phoneNumber, Date dateOfHire, float salary, boolean isAtWork) {
        super(firstName, secondName, lastName, phoneNumber);
        this.dateOfHire = dateOfHire;
        this.salary = salary;
        this.isAtWork = isAtWork;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isAtWork() {
        return isAtWork;
    }

    public void setAtWork(boolean atWork) {
        isAtWork = atWork;
    }

    public Employee() {
    }
}
