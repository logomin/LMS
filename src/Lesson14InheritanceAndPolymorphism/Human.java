package Lesson14InheritanceAndPolymorphism;

import java.util.Date;

public class Human {
    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
    private int phoneNumber;

    public void sayHello(){
        System.out.println("Привет");
    }

    public void sayGoodbye(){
        System.out.println("До свидания");
    }

    public Human(String firstName, String secondName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Human() {
    }
}
