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
}
