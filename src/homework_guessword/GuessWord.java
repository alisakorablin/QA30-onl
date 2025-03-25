package homework_guessword;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args){
        //Guess word - угадай слово
        startGame();
        //Алгоритм - определен кол-во операций, в опр порядке д/б сделаны, чтобы програм работала исправно

        //1) Приглашение в игру
        //2) Если принимаем приглашение то играем
        //2 1) если не принимаем - пока
        //3) если играем то задаем инструкции
        //4) созд массив слов котор б/хранить в массиве
        //5) после через класс Random  выберем 1но случ слово
        //6) выбрали случ слово - приглашаем пользователя угадать слово
        //7) слово угадывается полность или по буквам
        //8) если по буквам то проверить сущ ли такая буква и вывести на экран какую букву отгадали
        //8 1) если букву не отгадали то сказать что такой буквы нет и продолжить отгадываение
        //9) если была попыка угадывания слова полностью проверить угадали ли ? если да то победа и запросить
        //ХОТИТЕ ЛИ ВЫ СНОВА СЫГРАТЬ В ИГРУ?
        //9 1) если снова слово было не угадано - сообщаем это и продолжаем
        //10) рано или поздно все буквы будут отгаданы - тогда ПОБЕДА и запрашиваем хотите ли вы снова играть
        //если нет - прощайте если да - все ЗАНОВО

    }

    //стартуем игру
    public static void startGame(){
        //Scanner scanner = input();
        getIntroductoryMsg();

        boolean playAgain = true;

        if (playGame()){

            System.out.println("LETS PLAY GAME !");

            getInstructions();

            //getRandomWords() метод принимает результат работы метода words()
            //сам метод words() просто создает массив с данными
            //а вот метод getRandomWords() из этого массива берет случайное значение и возвращает
            //в переменную String hiddenWord

            //вызвали метод words() котор массив со словами
            //потом пробросили этот массив в getRandomWord()
            //вернули строчку и через метод toCharArray() трансформировали его в массив символов
            //char[] hiddenWord = getRandomWord(words()).toCharArray();
            String hiddenWord = getRandomWord(words());
            char[] guessedLetters = defineGuessedLetters(hiddenWord.length());


            System.out.println("*********************************************************************");
            System.out.println("AI have generated a hidden word for you. It is time to start a game");
            System.out.println("Your hidden word is: ".toUpperCase());
            showWord(guessedLetters);//было так showWord(hiddenWord);
            System.out.println("*********************************************************************");

            while(true){
                System.out.println("Please, enter a LETTER or a WHOLE WORD to GUESS");

                String input = input().nextLine();

                if (input.length() == 1){
                    //1- если ввели одну букву
                    //1) проверить если ли такая буква
                    // если нету продолжаем
                    //если есть - показать ее в слове а остальные буквы оставить скрытыми
                    //например: banana ввели букву - а
                    //на экране д/повится: *a*a*a
                    //если отгадали еще букву - b, ba*a*a
                    // и продолож вводить буквы
                    //следует проверить не закончились ли буквы у нас
                    //если все буквы отгаданы - проверка статуса и ВЫ ПОБЕДИЛИ
                    char letter = input.charAt(0);
                    if (!isLetterInWord(letter, hiddenWord)) {
                        System.out.println("There is no such letter");
                        continue;
                    }
                    updateGuessedLetters(hiddenWord, guessedLetters, letter);
                    showWord(guessedLetters);

                    if (isWordGuessed(guessedLetters, hiddenWord)) {
                        System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                        break; // Exit the loop
                    }


                    //добавить механиз повтора игры то есть если я победил не просто закончить игру
                    //а спросить меня: может еще ? да - заново . нет -прощайте и программа заканчивается
                } else if (input.length() > 1) {
                    //если ввели слово
                    //String.valueOf()-> превращает значения в строчку
                    //после этого .equalsIgnoreCase(_значения) - проверить слова на совпадения

                    if (checkWord(input, hiddenWord.toCharArray())) {
                        System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                        break;
                    } else{
                        System.out.println("YOU MISSED!");
                    }
                }
            }

            System.out.print("Would you like to play again? (y - YES, other - NO): ");
            String playAgainInput = input().nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("y");

            if (!playAgain) {
                System.out.println("You said NO. GOODBYE !");
            } else{
                startGame();
            }

        }else{
            System.out.println("You said NO. GOODBYE !");
        }
    }

    public static void getIntroductoryMsg(){
        System.out.println("Welcome to Guess Word Game. The PC randomly selects words and hides it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN");
    }

    public static boolean playGame(){
        System.out.println("***********************************************************************************");
        System.out.println("Would you like to play a Game? (y - YES, the rest - NO): ");

        return input().nextLine().equalsIgnoreCase("y");
    }

    public static void getInstructions(){
        System.out.println("The AI have created a set of hidden words. It stored these words in an array.");
        System.out.println("The random number has been generated to randomly select a word from the array.");
        System.out.println("You should guess the word either by a LETTER or a FULL WORD.");
    }

    public static String[] words(){
        return new String[]{
                "Apple", "House", "Car", "Stone", "Dragon", "Vehicle", "Pineapple","Watermelon",
                "Globe", "Tree", "Java", "Python", "Banana", "Building", "Butter", "Computer", "Notebook",
                "Bag", "Trousers", "Wardrobe"
        };
    }

    public static String getRandomWord(String[] hiddenWords){
        //верни мне массив hiddenWords[создай случайное число от 0 до длины массива]
        //если массив длиной в 20 элементов - то случайное число будет от 0 до 20 то есть 0-19
        return hiddenWords[new Random().nextInt(0, hiddenWords.length)];
    }

    public static void showWord(char[] word){
        for (char letter : word){
            System.out.print(letter + "\t");
        }
        System.out.println();
    }

    public static boolean checkWord(String input, char[] word){
        return String.valueOf(word).equalsIgnoreCase(input);
    }


   public static char[] defineGuessedLetters(int wordLength) {
        char[] guessedLetters = new char[wordLength];
        Arrays.fill(guessedLetters, '*');
        return guessedLetters;
    }

   public static void updateGuessedLetters(String wordToGuess, char[] guessedLetters, char letter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (Character.toLowerCase(wordToGuess.charAt(i)) == Character.toLowerCase(letter)) {
                guessedLetters[i] = wordToGuess.charAt(i);
            }
        }
   }

   public static boolean isLetterInWord(char letter, String word) {
        return word.toLowerCase().contains(String.valueOf(letter).toLowerCase());
        //return word.contains(String.valueOf(letter));
   }

   public static boolean isWordGuessed(char[] guessedLetters, String word) {
        String guessedWord = new String(guessedLetters);
        return guessedWord.equalsIgnoreCase(word);
   }

   public static Scanner input(){
        return new Scanner(System.in);
    }
}
