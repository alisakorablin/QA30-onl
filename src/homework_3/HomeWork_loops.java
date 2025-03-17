package homework_3;

import java.util.Scanner;

public class HomeWork_loops {
    public static void main(String[] args) {
        setFor(); //метод для таска1
        setWhile(); //метод для таска2
        getSum(); //метод для таска 3
        getSumWhile(); //метод для таска 4
        getSequence(); //метод для таска 5
        getQuadrant(); //метод для таска6
    }

    //Task1: При помощи цикла for вывести на экран нечетные числа от 1 до 99
    public static void setFor(){
        System.out.println("*****************TASK1****************");
        System.out.println("Здравствуйте! Здесь выведем нечетные числа от 1 до 99 с помощью цикла for");

        //for (объявление переменной; проверка логики; изменение переменной)
        for (int oddNumbers = 1; oddNumbers <= 99; oddNumbers++) {
            if (oddNumbers % 2 != 0) {
                System.out.println(oddNumbers);
            }
        }
    }

    //Task2: Вывести на экран числа от 5 до 1
    public static void setWhile() {
        System.out.println("*****************TASK2****************");
        System.out.println("Здравствуйте! Здесь выведем числа от 1 до 5 с помощью цикла while");

        int numbers = 5;

        while (numbers >= 1) {
            System.out.println(numbers);
            numbers--; //постфиксный деинкремент
        }
    }

    //Task3: пользователь вводит любое целое число, программа суммирует от 1 до введенного числв
    public static void getSum() {
        System.out.println("*****************TASK3****************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Некорректные данные");
        } else {
            int sum = 0;
            for (int sumCount = 1; sumCount <= number; sumCount++) {
                sum += sumCount; //sum=sum+sumCount (sumCount это счетчик)
        }
            System.out.println("Сумма всех чисел от 1 до введенного числа = " + sum);
        }
    }

    //Task4: вывести последовательно 7 14 21 28 35 42 49 56 63 70 77 84 91 98 (use while)
    public static void getSumWhile(){
        System.out.println("*****************TASK4****************");
        System.out.println("Здравствуйте! Здесь выведем числа 7 14 21 28 35 42 49 56 63 70 77 84 91 98");
        System.out.println("делаем с помощью цикла while");

        int numbers = 98;

        while (numbers >= 7) {
            System.out.println(numbers);
            numbers -= 7; //numbers=numbers-7
        }
    }

    //Task5: Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void getSequence(){
        System.out.println("*****************TASK5****************");
        System.out.println("Здравствуйте! Здесь выведем первые 10 чисел последовательности 0, -5,-10,-15..");

        //здесь бесконечный цикл, потому что мы не знаем конечное число под номером 10  в последовательности из условия
        for (int sequence = 0; ; sequence++) {
            int condition = sequence * -5; //установим условие последовательности
            System.out.println(condition);

            //здесь НЕ 11 а 9 потому что цикл б/выполн от 0 до 11 и это 12 итераций а надо 10
            if (sequence == 9) {
                break;//чтобы цикл прервался после 10ой итерации
            }
        }

    }

    //Task6: Вывести на экран квадраты чисел от 10 до 20 включительно
    public static void getQuadrant(){
        System.out.println("*****************TASK6****************");
        System.out.println("Здравствуйте! Здесь выведем квадраты чисел от 10 до 20 включительно");

        for (int quadrant = 10; quadrant <= 20; quadrant++){
            int multiple = quadrant * quadrant;
            System.out.println(multiple);
        }
    }
}

