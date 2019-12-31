package Lesson15Interfaces;

public class Dialphone extends Phone {
    boolean hasAnswerphone;

    @Override
    void powerOn() {
        System.out.println("Включаем телефон");
    }

    @Override
    void powerOff() {
        System.out.println("Выключаем телефон");
    }

    @Override
    void call() {
        System.out.println("Звоним");
    }

    void autoAnswer(){
        System.out.println("Автоответчик");
    }
}
