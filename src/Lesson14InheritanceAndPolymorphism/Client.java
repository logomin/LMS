package Lesson14InheritanceAndPolymorphism;

public class Client extends Human {
    private int discountCardNumber;
    private int moneyAmount;

    public void askAboutGoods() {
        System.out.println("Спрашиваю за товар");
    }

    public void buy() {
        System.out.println("Покупаю");
    }
}
