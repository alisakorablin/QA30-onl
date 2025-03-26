package homework_6;

public class MyMain {
    public static void main(String[] args) {
        increaseMoney();
        withdrawMoney();
    }

    public static void increaseMoney(){
        CreditCard card1 = new CreditCard();
        card1.accountNumber = 1;
        card1.currentSum = 1000;

        card1.getCreditcardInfo();

        CreditCard card2 = new CreditCard();
        card2.accountNumber = 2;
        card2.currentSum = 2000;

        card2.getCreditcardInfo();

        System.out.println("***************************************************************************");
        System.out.println("Я хочу добавить сумму");
        card1.increaseMoneyFromCard(100);
        card2.increaseMoneyFromCard(200);
    }

    public static void withdrawMoney(){
        CreditCard card3 = new CreditCard();
        card3.accountNumber = 3;
        card3.currentSum = 3000;

        card3.getCreditcardInfo();

        System.out.println("***************************************************************************");
        System.out.println("Я хочу снять сумму");
        card3.withdrawMoneyFromCard(300);
    }
}
