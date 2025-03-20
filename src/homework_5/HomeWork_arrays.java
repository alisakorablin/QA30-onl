package homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_arrays {
    public static void main(String[] args) {
        getThreeArray();
        getChessboard();
    }

    //Task1
    public static void getThreeArray() {
        System.out.println("**************TASK1***************");

        // трехмерный массив
        int[][][] table = {
                {
                        {0, 1, 2}, //[0][0][0], [0][0][1], [0][0][2]
                        {3, 4}, //[1][0][0], [1][0][1]
                        {5} //[2][0][0]
                }
        };
        getThreeTableArray(table);
    }

    //выводим оригинальный массив
    public static void getThreeTableArray(int[][][] table) {
        System.out.println("Оригинальный массив");
        for (int outer = 0; outer < table.length; outer++) { //ходим по строкам
            for (int inner = 0; inner < table[outer].length; inner++) {// ходим по столбцам исходя из строк
                for (int innerAdditional = 0; innerAdditional < table[outer][inner].length; innerAdditional++) { //ходим
                    //по третьему слою
                    System.out.println(table[outer][inner][innerAdditional]); //выводим массив
                }
            }
        }
        increaseArray(table);
    }

    //увеличаем какждый элемент массива на число из консоли и выводим новый массив
    public static void increaseArray(int[][][] table) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, на которое будем увеличивать каждый элемент заданного массива: ");
        int increaseNumber = scanner.nextInt();// число на которое будем увеличать массив

        //цикл увеличения
        for (int newOuter = 0; newOuter < table.length; newOuter++) {       // перебираем строки
            for (int newInner = 0; newInner < table[newOuter].length; newInner++) { //перебираем столбцы исходя из
                //каждой строки
                for (int newInnerAdditional = 0; newInnerAdditional < table[newOuter][newInner].length;
                     newInnerAdditional++) {
                    table[newOuter][newInner][newInnerAdditional] += increaseNumber; // увеличиваем каждый элемент
                    //массива на increaseIndex
                }
            }
        }

        //вывод нового массива
        System.out.println("Новый массив");
        for (int newOuter = 0; newOuter < table.length; newOuter++) {       // Перебираем строки
            for (int newInner = 0; newInner < table[newOuter].length; newInner++) { //перебираем столбцы
                for (int newInnerAdditional = 0; newInnerAdditional < table[newOuter][newInner].length;
                     newInnerAdditional++) {
                    System.out.println(table[newOuter][newInner][newInnerAdditional]);
                }
            }
        }
    }

    //Task2
    public static void getChessboard(){
        System.out.println("**************TASK2***************");

        String[][] chessboard = new String[8][8]; //объявление массива размером 8х8 (потому что в результате
        // хотим такой видеть)

        // задаем элементам значения B and W
        for (int row = 0; row < 8; row++) { //смотрим на строки
            for (int column = 0; column < 8; column++) { //смотрим на столбцы
                // условие как определить цвет клетки
                if ((row + column) % 2 == 0) {
                    chessboard[row][column] = "W"; // вывод W
                } else {
                    chessboard[row][column] = "B"; //вывод B
                }
                System.out.print(chessboard[row][column] + " ");
            }
            System.out.println();
        }
    }
}