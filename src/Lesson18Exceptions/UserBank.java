package Lesson18Exceptions;

public class UserBank {
    public static void main(String[] args) {
        int amount = -58;
        long lCN = 1234567890;
        long bCN = 1234567890;

        try {
            MoneyTransactionUtil.sendTo(lCN, bCN, amount);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают");
        } catch (MoneyValueExeption e){
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}
