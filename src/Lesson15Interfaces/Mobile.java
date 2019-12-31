package Lesson15Interfaces;

public class Mobile extends Phone {
    int simCount;
    String display;

    @Override
    void powerOn() {
        System.out.println("Включаем мобильный телефон");
    }

    @Override
    void powerOff() {
        System.out.println("Выключаем мобильный телефон");
    }

    @Override
    void call() {
        System.out.println("Звоним");
    }
}
