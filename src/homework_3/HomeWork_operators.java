package homework_3;

import java.util.Scanner;

public class HomeWork_operators {
    public static void main(String[] args) {
        startMonthCalculator(); //вводный метод таск 1 и таск 2
        getInitialMssg3(); //вводный метод для таск 3
        getInitialMssg4(); //вводный метод для таск 4
        getIntialMssg5(); //вводный метод для таск 5
    }

        //Task 1: вывод поры года по номеру месяца, используя оператор switch-case
        public static void startMonthCalculator() {
            //Get initial message
            getInitialMssg();
            getInitialMssg2();
        }
        public static void getInitialMssg(){
            //Welcome to calculator by month
            System.out.println("****************TASK1*****************************");
            System.out.println("Здравствуете! В этом калькуляторе можно вычислить пору года по номеру месяца ");
            System.out.println("Реализовано с помощью оператора switch-case");
            getSeasonSwitch(); //вызываем метод, находящийся внизу
        }
       /* public static void getMonthData() {
            //получение данных с клавиатуры
            //Scanner - simple class how to receive data from keyboard
            //Создаем объект через keyword new
            //new выдел память для класса/объекта
            //System.in - указ компилятору, что data придет с клавиатуры
            Scanner input = new Scanner(System.in);

            any code
            int month = input.nextInt(); //input имя класса/объекта Scanner
            //newInt  ждем данные типа int (the same for double/floar/string...)

        }*/
        public static void getSeasonSwitch(){
        //выводим результат
           Scanner scanner = new Scanner(System.in);

           System.out.print("Введите номер месяца (1-12): ");
           int month = scanner.nextInt();

            switch (month) {
                case 12:
                case 1:
                case 2:
                    //season = "Зима";
                    System.out.println("Вы ввели номер месяца " + month + " Это зима");
                    break; //ломает оператор
                case 3:
                case 4:
                case 5:
                    //season = "Весна";
                    System.out.println("Вы ввели номер месяца " + month + " Это весна");
                    break;
                case 6:
                case 7:
                case 8:
                    //season = "Лето";
                    System.out.println("Вы ввели номер месяца " + month + " Это лето");
                    break;
                case 9:
                case 10:
                case 11:
                    //season = "Осень";
                    System.out.println("Вы ввели номер месяца " + month + " Это осень");
                    break;
                default:
                    //season = "Некорректный месяц";
                    System.out.println("Вы ввели номер месяца " + month + " Это некорректные данные");
                    break;
            }
            }

        //Task 2: вывод поры года по номеру месяца, используя оператор if-else
        public static void getInitialMssg2(){
            System.out.println("****************TASK2*****************************");
            System.out.println("Здравствуете! В этом калькуляторе можно вычислить пору года по номеру месяца ");
            System.out.println("Реализовано с помощью оператора if-else");
            getSeasonIfElse(); //вызываем метод, находящийся внизу
            }
        public static void getSeasonIfElse(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите номер месяца: ");
            int monthNumber = scanner.nextInt();

            //условие ввода
            if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12){
                System.out.println("Пора года: Зима");
            } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
                System.out.println("Пора года: Весна");
            } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
                System.out.println("Пора года: Лето");
            } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
                System.out.println("Пора года: Осень");
            } else {
                System.out.println("Некорректные данные"); //говорит о том что во всех остальных случаях выводим это
            }

             //метод сканнер НЕ закрываем сканнер. на уровне метода он сам закроется
        }

        //Task 3: четное/нечетное число
        public static void getInitialMssg3(){
            System.out.println("****************TASK3*****************************");
            System.out.println("Здравствуете! В этом калькуляторе можно вычислить число четное или нечетное");
            checkNumber();
    }
        public static void checkNumber() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            //вычисляем четное или нечетное число
            if (number % 2 == 0) {
                System.out.println("Это четное число");
            } else {
                System.out.println("Это нечетное число");
            }
        }

        //Task 4: температура на улице
        public static void getInitialMssg4(){
            System.out.println("****************TASK4*****************************");
            checkTemperature();
    }
        public static void checkTemperature(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите температуру на улице: ");
            double temperature = scanner.nextDouble();

            if (temperature > -5){
                System.out.println("Тепло");
            } else if (temperature > -20 && temperature <= -5){
                System.out.println("Нормально");
            } else if (temperature <= -20){
                System.out.println("Холодно");
            } else {
                System.out.println("Некорретные данные");
            }
    }

        //Task 5: цвет радуги
        public static void getIntialMssg5(){
            System.out.println("****************TASK5*****************************");
            System.out.println("Определить цвет радуги по номеру (1-7)");
            checkColor();
        }
        public static void checkColor(){
        int color = 6; //для примера
            switch (color){
                case 1:
                    System.out.println("Номер " + color + " Ваш цвет красный");
                    break;
                case 2:
                    System.out.println("Введенный номер " + color + " Ваш цвет оранжевый");
                    break;
                case 3:
                    System.out.println("Введенный номер " + color + " Ваш цвет желтый");
                    break;
                case 4:
                    System.out.println("Введенный номер " + color + " Ваш цвет зеленый");
                    break;
                case 5:
                    System.out.println("Введенный номер " + color + " Ваш цвет голубой");
                    break;
                case 6:
                    System.out.println("Введенный номер " + color + " Ваш цвет синий");
                    break;
                case 7:
                    System.out.println("Введенный номер " + color + " Ваш цвет фиолетовый");
                    break;
                default:
                    System.out.println("Введенный номер " + color + " Некорретные данные");
                    break;
            }
        }
}


