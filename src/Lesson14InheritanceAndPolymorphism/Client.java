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

    public Client(String firstName, String secondName, String lastName, int phoneNumber, int discountCardNumber, int moneyAmount) {
        super(firstName, secondName, lastName, phoneNumber);
        this.discountCardNumber = discountCardNumber;
        this.moneyAmount = moneyAmount;
    }

    public int getDiscountCardNumber() {
        return discountCardNumber;
    }

    public void setDiscountCardNumber(int discountCardNumber) {
        this.discountCardNumber = discountCardNumber;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Client() {
    }
}
