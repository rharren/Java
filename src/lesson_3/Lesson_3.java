package lesson_3;
/**
 * created by rharren-
 * date 31.01.2022
 * java lvl 1 hw lesson 3
  */
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {


        //1. Написать программу, которая загадывает случайное число от 0 до 9,
        // и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить больше ли указанное пользователем
        // число чем загаданное, или меньше. После победы или проигрыша выводится запрос
        // – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        guessNumber();


        /*2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
         "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
         "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
          "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
                Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
                apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
        */
        guessFood();
    }

    //1. Написать программу, которая загадывает случайное число от 0 до 9,
    // и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем
    // число чем загаданное, или меньше. После победы или проигрыша выводится запрос
    // – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    static void guessNumber() {
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        Scanner scan = new Scanner(System.in);
        int guessChance = 3;
        while (guessChance > 0) {
            System.out.println("Введите целое число от 0 до 9.");
            int guessNum = scan.nextInt();
            if (guessNum < 0 || guessNum > 9) {
                System.out.println("Ошибка ввода! Ввели число не в диапазоне от 0 до 9!");
                break;
            } else {
                guessChance = guessChance - 1;
                if (guessNum == randNum){
                    System.out.printf("Ура! Ты угадал число! Попыток оставалось %d.\n", guessChance);
                    break;
                }else{
                    System.out.printf("Ты не угадал число. Попыток оставалось %d.\n", guessChance);
                    if (guessNum > randNum){
                        System.out.printf("Ты ввел число %d, оно больше загаданного числа.\n", guessNum);
                    } else{
                        System.out.printf("Ты ввел число %d, оно меньше загаданного числа.\n", guessNum);
                    }

                }
            }


        }
        System.out.printf("Загаданное число было %d.\n", randNum);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int answer = scan.nextInt();
        if (answer == 1){
            guessNumber();
        } else if (answer == 0){
            System.out.println("Ну что ж, пока.");
        }else{
            System.out.println("Ошибка ввода ответа!");
        }
    }

    /*2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
         "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
         "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
          "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
                Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
                apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы
        */
    static void guessFood(){
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int randInd = rand.nextInt(words.length);
        String wordToFind = words[randInd];
        System.out.println(wordToFind);
        String guessTry;
        System.out.println(wordToFind.length());

        do {
            System.out.println("Угадай еду!");
            Scanner scan = new Scanner(System.in);
            guessTry = scan.next();
            guessTry = guessTry.toLowerCase();
            String line = "###############";
            if ( guessTry.equals(wordToFind)){
                System.out.println("Угадал слово!");
                break;
            } else{
                System.out.println("Не угадал!");
                for (int i = 0; i < line.length(); i++ ){
                    if (i < wordToFind.length() && i < guessTry.length()){
                        if (wordToFind.charAt(i) == guessTry.charAt(i)){
                            System.out.print(wordToFind.charAt(i));
                        } else{
                            System.out.print('#');
                        }
                    }else{
                        System.out.print('#');
                    }
                }
                System.out.println();
            }
        }
        while (!guessTry.equals(wordToFind));
    }
}
