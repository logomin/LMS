package Lesson15Interfaces;

public class Dialphone extends Phone implements Caller {
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
    public void call() {
        System.out.println("Звоню (обычный телефон)");
    }

    void autoAnswer(){
        System.out.println("Автоответчик");
    }


}
