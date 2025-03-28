package homework_tictactoe.game;

import java.util.Random;
import java.util.Scanner;

public class GameTicTacToe {
    public static final char USER_SYMBOL;
    public static final char AI_SYMBOL;
    public static final char EMPTY_SYMBOL = '*';
    public static char[][] table; // Игровое поле

    static {
        // Статический блок инициализации для случайного выбора символов
        Random random = new Random();
        if (random.nextBoolean()) {
            USER_SYMBOL = 'X';
            AI_SYMBOL = 'O';
        } else {
            USER_SYMBOL = 'O';
            AI_SYMBOL = 'X';
        }
        System.out.println("User plays as: " + USER_SYMBOL);
        System.out.println("AI plays as: " + AI_SYMBOL);
    }


    public GameTicTacToe() {
        startGame();
    }


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        getInitialMSG();
        tableTwo();

        while (true) {
            if ((scanner.nextLine()).equalsIgnoreCase("y")) {
                table = initializeTable(); // Инициализация игрового поля
                System.out.println("************************************");
                getRules();
                System.out.println("************************************");
                System.out.println("Let's decide who makes the first move?!");

                Random random = new Random();
                int randomNumber = random.nextInt(0, 101);

                boolean userTurn = (randomNumber <= 50); // Определяем, кто ходит первым
                System.out.println((userTurn ? "User" : "AI") + " goes first!");

                int moves = 0; // Счетчик ходов
                boolean gameFinished = false;

                while (!gameFinished && moves < 9) { // Играем, пока не будет победитель или не закончится поле
                    if (userTurn) {
                        makeUserMove(scanner);
                    } else {
                        makeAIMove();
                    }
                    printTable(); // Выводим поле после каждого хода

                    moves++; // Увеличиваем счетчик ходов


                    // ВЫЗОВ isBoardFull() ЗДЕСЬ
                    if (moves >= 5) { // Проверка на выигрыш начинается только после 5 хода

                        // Проверяем на выигрыш
                        if (checkRows(table, USER_SYMBOL) || checkColumn(table, USER_SYMBOL) ||
                                checkAxes(table,USER_SYMBOL)) {
                            System.out.println("User wins!");
                            gameFinished = true;
                        } else if (checkRows(table, AI_SYMBOL) || checkColumn(table, AI_SYMBOL) ||
                                checkAxes(table, AI_SYMBOL)) {
                            System.out.println("AI wins!");
                            gameFinished = true;
                        }

                        // Проверяем на ничью, если нет победителя
                        if (!gameFinished && isBoardFull()) {
                            System.out.println("It's a draw!");
                            gameFinished = true;
                        }

                    }
                    userTurn = !userTurn; // Передаем ход другому игроку
                }

                if (!gameFinished) {
                    System.out.println("It's a draw!"); // Если вышли из цикла без победителя, значит ничья
                }

            } else {
                System.out.println("You choose not to move on with the game. GOODBYE!");
            }
            break; // Выходим из цикла, если игра завершена или пользователь отказался играть
        }
    }

    public void makeAIMove() {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (table[row][col] != EMPTY_SYMBOL);

        table[row][col] = AI_SYMBOL;
    }

    public void makeUserMove(Scanner scanner) {
        int row, col;
        do {
            System.out.print("Enter row (1-3): ");
            row = scanner.nextInt() - 1;  // Преобразуем ввод пользователя в индекс массива (1-3 -> 0-2)
            System.out.print("Enter column (1-3): ");
            col = scanner.nextInt() - 1; // Преобразуем ввод пользователя в индекс массива (1-3 -> 0-2)
            if (row < 0 || row > 2 || col < 0 || col > 2 || table[row][col] != EMPTY_SYMBOL) {
                System.out.println("Invalid move. Try again.");
            }
        } while (row < 0 || row > 2 || col < 0 || col > 2 || table[row][col] != EMPTY_SYMBOL);

        table[row][col] = USER_SYMBOL;
        scanner.nextLine();
    }

    public boolean checkRows(char[][] letters, char userSymbol) {

        int userCounter = 0;
        int aiCounter = 0;

        for (int row = 0; row < letters.length; row++) {
            for (int col = 0; col < letters[row].length; col++) {
                if (letters[row][col] == USER_SYMBOL) {
                    userCounter++;
                } else if (letters[row][col] == AI_SYMBOL) {
                    aiCounter++;
                }
            }
            if (userCounter == 3) {
                System.out.println("USER WON!(BY ROWS)");
                return true;
            } else if (aiCounter == 3) {
                System.out.println("AI WON!(BY ROWS)");
                return true;
            }
            userCounter = 0;
            aiCounter = 0;
        }
        return false;
    }

    public boolean checkColumn(char[][] letters, char userSymbol){

        int userCounter = 0;
        int aiCounter = 0;

        for (int col = 0; col < letters[0].length; col++) {
            for (int row = 0; row < letters.length; row++) {
                if (letters[row][col] == USER_SYMBOL) {
                    userCounter++;
                } else if (letters[row][col] == AI_SYMBOL) {
                    aiCounter++;
                }
            }
            if (userCounter == 3) {
                System.out.println("USER WON!(BY COLUMNS)");
                return true;
            } else if (aiCounter == 3) {
                System.out.println("AI WON!(BY COLUMNS)");
                return true;
            }
            userCounter = 0;
            aiCounter = 0;
        }
        return false;
    }

    public boolean checkAxes(char[][] letters, char userSymbol){
        //первая диагональ
        if ((letters[0][0] == letters[1][1]) && (letters[1][1] == letters[2][2])) {
            if (letters[0][0] == USER_SYMBOL) {
                System.out.println("USER WON!(BY DIAGONALS)");
                return true;
            } else if (letters[0][0] == AI_SYMBOL) {
                System.out.println("AI WON!(BY DIAGONALS)");
                return true;
            }
        }

        // Вторая диагональ (побочная)
        if ((letters[0][2] == letters[1][1]) && (letters[1][1] == letters[2][0])) {
            if (letters[0][2] == USER_SYMBOL) {
                System.out.println("USER WON!(BY DIAGONALS)");
                return true;
            } else if (letters[0][2] == AI_SYMBOL) {
                System.out.println("AI WON!(BY DIAGONALS)");
                return true;
            }
        }
        return false;
    }

    public void getRules(){
        System.out.println("You decided to play the game.");
        System.out.println("Here are the rules. You have a table 3x3.");
        System.out.println("You will play with the AI.");
        System.out.println("To make a move you must enter coordinates x & y.");
        System.out.println("X - rows, y - columns. The first column in the first low equals 1, 1.");
    }

    public void getInitialMSG(){
        System.out.println("*********************************************");
        System.out.println("Welcome to Tic-tac-Toe game");
        System.out.println("You need to play against AI.");
        System.out.println("Would like to play a Game?!");
        System.out.println("**********************************************");
    }

    public char[][] initializeTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
        };
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (table[row][col] == EMPTY_SYMBOL) {
                    return false; // Есть пустая ячейка
                }
            }
        }
        return true;
    }

    public void printTable() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(table[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    public void tableTwo(){
        char [][] letters = new char[][]{
                {'*', 'O', 'X'},
                {'O', 'O', '*'},
                {'X', 'X', 'X'},
        };

        checkAxes(letters, USER_SYMBOL);
        checkRows(letters, USER_SYMBOL);
        checkColumn(letters, USER_SYMBOL);
    }


}
