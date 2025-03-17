package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_array {
    public static void main (String[] args){
        getIntArray();
        arrayWithoutNumber();
        arrayFromKeyboard();
        getTwoArrays();
    }

    //Task0: Создайте массив целых чисел. Напишете программу, которая выводит
    //сообщение о том, входит ли заданное число в массив или нет.
    //Пусть число для поиска задается с консоли (класс Scanner).
    public static void getIntArray(){
        System.out.println("*****************TASK 0 ****************");

        //создаем массив целых чисел
        int array[] = new int[]{-1, 0, 8, 15};

        System.out.println("Введите любое целое число");
        //это анонимный экземпляр класса Сканнер
        //аноним экз класса - это объект у котор нет имени
        //т е он один раз создается выполняется и удаляется
        //тк у него нет имени то нет и постоян адреса в памяти
        // к нему нельзя обратиться вновь
        int numbersInput = new Scanner(System.in).nextInt();

        //условие цикла на существование числа в заданном массиве
        boolean containsInArray = false; // сначала думаем что числа нет в массиве

        //рашсиренный цикл for
        //задаем переменную : переменная из массива array
        for (int number : array) {
            //numbersInput - это из класса Сканнер
            if (number == numbersInput) {
                containsInArray = true;  // думаем что число есть  в массиве и меняет флаг на тру
                break;
            }
        }

        //условие вывода
            if (containsInArray) {
                System.out.println("Введенное число входит в массив");
            } else {
                System.out.println("Введенное число не входит в массив.");
            }
    }

    //Task1
    public static void arrayWithoutNumber(){
        System.out.println("*****************TASK 1 ****************");
        int array[] = new int[]{0, 0, 0, 0};

        System.out.println("Введите любое целое число");
        int numbersInput = new Scanner(System.in).nextInt();

        //условие цикла на существование числа в заданном массиве
        boolean containsInArray = false;
        for (int number : array) {
            if (number == numbersInput) {
                containsInArray = true;
                break;
            }
        }

        // считаем количество цифр в массиве, которые останутся
        int count = 0;
        for (int number : array) {
            if (number != numbersInput) {
                count++;
            }
        }

        //новый массив  в который будем записыывать цифры из оригинального массива - введенное пользователем число
        int newArray[] = new int[count];

        // заполним новый массив
        //создали новый счетчик (специально) который работает с newArray. нужно создать оригинальный счетчик
        int newCount = 0;
        for (int number : array) {
            if (number != numbersInput) {
                newArray[newCount] = number;
                newCount++;
            }
        }

        //условие вывода
        if (containsInArray) {
            //выводим значения нового массива
            System.out.println("Новый массив без введенного числа." + Arrays.toString(newArray));
        } else {
            System.out.println("Введенное число не входит в массив.");
        }
    }

    //Task 2
    public static void arrayFromKeyboard(){
        System.out.println("*****************TASK 2 ****************");


        System.out.println("Введите размер массива");
        int arraySize = new Scanner(System.in).nextInt();//размер массива с клавы

        int array[] = new int[arraySize]; //создание массива с клавы

        int minNumber = 1; //минимальное значение в массиве
        int maxNumber = 100; //максимальное значение в массиве

        //заполняем массив методом Math.random()
        for (int digits = 0; digits < arraySize; digits++) {
            array[digits] = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
        }
            System.out.println("Массив, заполненный случаными числами: " + Arrays.toString(array));

        //вывод максимального и минимального значения из массива
        int minValue = array[0];
        int maxValue = array[0];

        //мин макс значение
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);

        //вычисляем средннее значение мин и макc элементов в массиве
        double averageValue = (double) (minValue + maxValue) / 2;
        System.out.println("Среднее значение минимального и максимального значения в массиве: " + averageValue);
    }

    //Task3
    public static void getTwoArrays(){
        System.out.println("*****************TASK 3 ****************");

        int arrayOne[] = new int[]{-1, 0, 8, 15, 20};
        int arrayTwo[] = new int[]{5, 10, 25, 30, 35};

        System.out.println("Массив 1: " + Arrays.toString(arrayOne));
        System.out.println("Массив 2: " + Arrays.toString(arrayTwo));

        //считаем ср арифмет Массива 1 и Массива 2
        int sumOne = 0; //сумма первого массива
        for (int number : arrayOne) {
            sumOne += number;
        }

        int sumTwo = 0; //сумма второго массива
        for (int number : arrayTwo) {
            sumTwo += number;
        }

        double average = (double) (sumOne + sumTwo) / 2; //считаем ср ариыметическое
        System.out.println("Среднее арифметическое: " + average);
    }
}

