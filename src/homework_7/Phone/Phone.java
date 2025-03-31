package homework_7.Phone;

public class Phone {
    private String phoneNumber;
    private String phoneModel;
    private double phoneWeight;

    //конструктор
    public Phone(String phoneNumber, String phoneModel, double phoneWeight){
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }

    //конструктор
    public Phone(String phoneNumber, String phoneModel){
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
    }

    //конструктор
    public Phone(){
        this.phoneNumber = "+375333333333";
        this.phoneModel = "Vivo Y35";
        this.phoneWeight = 100;
    }

    public String getPhoneInformatiom(){
        return "Phone Number: " + this.phoneNumber + ".\n" +
                "Phone model: " + this.phoneModel + ".\n" +
                "Phone weight: " + this.phoneWeight + ".\n";
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    public String getNumber() {
        return phoneNumber;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправляем сообщение на номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
