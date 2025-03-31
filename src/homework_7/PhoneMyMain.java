package homework_7;

import homework_7.Phone.Phone;

public class PhoneMyMain {

    public static void main (String[] args){
        phoneInfo();
    }

    public static void phoneInfo(){
        Phone phone1 = new Phone("+375111111111", "iPhone 15",  200);
        Phone phone2 = new Phone("+375222222222", "Samsung Galaxy S24");
        Phone phone3 = new Phone();

        System.out.println(phone1.getPhoneInformatiom());
        System.out.println(phone2.getPhoneInformatiom());
        System.out.println(phone3.getPhoneInformatiom());


        phone1.receiveCall("Абонент 1");
        phone2.receiveCall("Абонент 2", "+375222222222");

        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());

        phone1.sendMessage("+3754444444444", "+37555555555", "+376666666");
    }
}
