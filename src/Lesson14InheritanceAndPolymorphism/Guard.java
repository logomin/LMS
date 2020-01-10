package Lesson14InheritanceAndPolymorphism;

import java.util.Date;

public class Guard extends Employee {
    public void speakingRadio(){
        System.out.println("Говорю по рации");
    }

    @Override
    public void doingWork() {
        comeToWork();
        System.out.println("Делаю работу охранника");
        goToLunch();
        speakingRadio();
    }

    public Guard(String firstName, String secondName, String lastName, int phoneNumber, Date dateOfHire, float salary, boolean isAtWork) {
        super(firstName, secondName, lastName, phoneNumber, dateOfHire, salary, isAtWork);
    }

    public Guard() {
    }
}