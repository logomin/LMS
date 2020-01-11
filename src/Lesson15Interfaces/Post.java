package Lesson15Interfaces;

public class Post implements MailSender {
    @Override
    public String createMail(String s) {
        System.out.println("Создаю традиционное письмо");
        return "Создаю традиционное письмо";
    }

    @Override
    public void SendMail(String s) {
        System.out.println("Отправляю традиционное письмо");
    }
}
