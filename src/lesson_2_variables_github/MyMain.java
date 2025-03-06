package lesson_2_variables_github; //package - java's directories

public class MyMain {
    public static void main (String[] args){
        getBasicVariables();//method call
    }

    //Methods
    //вывод значений типов данных и приведение типа
    public static void getBasicVariables (){
    System.out.println("Welcome to java variables basics.");

    //Primitive types
        // integer
        byte myByte = 124; //не use. сохран только для обр совместимости
        short myShort = 21345; //не use. сохран только для обр совместимости
        int myInt = 2_000_294_000;
        long myLong = -4_985_438_985L; //L  в конце показывает что именно указываем переменную long (same for float)

        //целочисл но знак
        char letter = 'G'; //для вывода одного знака (от слова character)
        System.out.println("Charater: " + letter + ". Let's see in integer value " + (int) letter); //приведение типа

        //приведение типа: letter +10 преврати в char. use скобки для приоритетов операций
        letter =  (char) (letter + 10);
        System.out.println("Charater: " + letter + ". Let's see in integer value " + (int) letter);

        //с плав точной
        float myFloat = 45.3457F;
        double myDouble = 45.758587578;

        //логическая истина или ложь
        boolean isAlive = true;

        System.out.println("byte " + myByte);
        System.out.println("short " + myShort);
        System.out.println("int " + myInt);
        System.out.println("long " + myLong);
        System.out.println("char " + letter);}

//Reference types
String myString = "My name is Alisa and my last name is Korablina";
    }