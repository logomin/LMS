package Lesson7Classes;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        article.title = "Some words about Garbage Collector in JVM";
        Book book = new Book();
        book.title = "Java for Beginners";
        PostOffice postOffice = new PostOffice();
        postOffice.zip = 69118;
        ShopCustomer shopCustomer = new ShopCustomer();
        shopCustomer.gender = "male";
        System.out.println("Имя класса: " + article.getClass().getName() + "\ntitle --- " + article.title);
        System.out.println("Имя класса: " + book.getClass().getName() + "\ntitle --- " + book.title);
        System.out.println("Имя класса: " + postOffice.getClass().getName() + "\nzip --- " + postOffice.zip);
        System.out.println("Имя класса: " + shopCustomer.getClass().getName() + "\ngender --- " + shopCustomer.gender);
    }
}
