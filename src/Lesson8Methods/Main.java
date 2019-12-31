package Lesson8Methods;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        article.setTitle("Some words about Garbage Collector in JVM");
        Book book = new Book();
        book.setTitle("Java for Beginners");
        PostOffice postOffice = new PostOffice();
        postOffice.setZip(69118);
        ShopCustomer shopCustomer = new ShopCustomer();
        shopCustomer.setGender("male");
        System.out.println("Имя класса: " + article.getClass().getName() + "\ntitle --- " + article.getTitle());
        System.out.println("Имя класса: " + book.getClass().getName() + "\ntitle --- " + book.getTitle());
        System.out.println("Имя класса: " + postOffice.getClass().getName() + "\nzip --- " + postOffice.getZip());
        System.out.println("Имя класса: " + shopCustomer.getClass().getName() + "\ngender --- " + shopCustomer.getGender());

        article.nextPage();
        article.sectionList();
        article.sectionBypage();
        book.chapterBypage();
        book.chapterList();
        book.nextPage();
        book.tpPage(15);
        book.tpPage(2,"ch");
        postOffice.PackPackageList();
        postOffice.SendPackageList();;
        postOffice.TakePackageList();
        System.out.println(PostOffice.weightOfPackage(20, 30, 40));
        shopCustomer.buy();
        shopCustomer.lookBonus();
        shopCustomer.toBucket();


    }
}
