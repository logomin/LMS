package Lesson15Interfaces;

public class Smartphone extends Mobile implements Caller, EmailSender {
    String os;

    void runApp(){
        System.out.println("Запусукаем приложение");
    }

    @Override
    public String editMail(String s) {
        System.out.println("Редактирую сообщение");
        return "Редактирую сообщение";
    }

    @Override
    public String createMail(String s) {
        System.out.println("Создаю сообщение");
        return "Создаю сообщение";
    }

    @Override
    public void SendMail(String s) {
        System.out.println("Отправляю сообщение");
    }

    @Override
    public void call() {
        System.out.println("Звоню (смартфон)");
    }
}
