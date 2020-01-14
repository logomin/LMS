package Lesson18Exceptions;

public class MoneyTransactionUtil {

    private MoneyTransactionUtil() {
    }

    static void sendTo(long lenderCardNumber, long borrowerCardNumber, int amount) throws AccountException, MoneyValueExeption{
        if (lenderCardNumber == borrowerCardNumber) throw new AccountException();
        if (amount <= 0 || amount > 100_000 ) throw new MoneyValueExeption();
        System.out.println("Сумма " + amount + ", со счета " + lenderCardNumber + " успешно переведена на счет " + borrowerCardNumber);
    }

}
