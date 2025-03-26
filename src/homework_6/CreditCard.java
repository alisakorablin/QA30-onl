package homework_6;

public class CreditCard {
    //поля класса
    //поле класса это переменная уровня класс котор достпна всем внутренностям этого же класса
    //на уровне класса компилятор самостоятельно задаст дефолтные значения всем базовым типам и в том числе String

    //поля класса CreditCard
    public long accountNumber;
    public double currentSum;

    //Добавьте метод, который позволяет начислять сумму на кредитную карточку
    public void increaseMoneyFromCard(long valueIncrease){
            currentSum += valueIncrease;
            System.out.println("Вы добавили такую сумму: " + valueIncrease + ". " +
                    "Ваш баланс: " + currentSum + " с аккаунта " + accountNumber);
    }

    //Добавьте метод, который позволяет снимать с карточки некоторую сумму
    public void withdrawMoneyFromCard(long value){
        if (value > currentSum){
            System.out.println("Недостаточно денег. Ваш баланс: " + currentSum);
        } else {
            currentSum -=value;
            System.out.println("Вы сняли такую сумму: " + value + ". " +
                    "Ваш баланс: " + currentSum + " с аккаунта " + accountNumber);
        }
    }

    //Добавьте метод, который выводит текущую информацию о карточке
    public void getCreditcardInfo(){
        System.out.println("*************************************************");
        System.out.println("Номер аккаунта: " + accountNumber);
        System.out.println("Остаток на счету: " + currentSum);
    }
}
