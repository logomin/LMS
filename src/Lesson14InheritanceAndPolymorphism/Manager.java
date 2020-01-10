package Lesson14InheritanceAndPolymorphism;

import java.util.Date;

public class Manager extends Employee {
    private String department;

    public void consult(){
        System.out.println("Консультирую");
    }

    public void tellAboutDiscount(){
        System.out.println("Расказываю про скидки");
    }

    public void advise(){
        System.out.println("Советую");
    }

    @Override
    public void doingWork() {
        System.out.println("Делаю работу менеджера");;
    }

    public Manager(String firstName, String secondName, String lastName, int phoneNumber, Date dateOfHire, float salary, boolean isAtWork, String department) {
        super(firstName, secondName, lastName, phoneNumber, dateOfHire, salary, isAtWork);
        this.department = department;
    }

    public Manager() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
