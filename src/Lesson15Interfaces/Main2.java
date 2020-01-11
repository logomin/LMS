package Lesson15Interfaces;

public class Main2 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        Smartphone smartphone2 = new Smartphone();
        Post post = new Post();

        SendAll("Санта Клаусу", smartphone1, smartphone2, post);

    }

    public static void SendAll(String address, MailSender... mails){
        for (MailSender mail: mails) {
            mail.SendMail(address);
        }
    }
}
