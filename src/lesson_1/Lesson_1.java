
package lesson_1;

/**
 * Created by rharren-
 * Date 19.01.2022
 * Java lesson_1 homework basic introduction to java
 */


public class Lesson_1 {
    public static void main(String[] args) {
//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte b = 126;
        short s = 5;
        int i = 3;
        long l = 356;
        float f = 23.4f;
        double d = 356.9789;
        boolean bl = true;
        char c = 'S';
        String line = "Hello, Tima-lavash";

//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println(calc(1, 2, 6, 3));

//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println(in_ten_twenty_range(8, 9));
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        positive_or_negative_num(-2);

//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println(check_if_negative(-5));

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        string_welcome("Лаваш");

// 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        check_year(2022);

    }

    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – входные параметры этого метода;
        */
    private static double calc(double a, double b,  /** Вопрос: Тима, везде надо public у метода писать?*/
                               double c, double d) {
        double tmp = a * (b + (c / d)); // просто с переменной попробывал
        return tmp;
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
// в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean in_ten_twenty_range(double a, double b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное ли число передали, или отрицательное;
// Замечание: ноль считаем положительным числом.
    public static void positive_or_negative_num(int a) {
        if (a == 0 || a > 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;
    public static boolean check_if_negative(int a) {
        return (a < 0);
    }

    //7. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void string_welcome(String a) {
        System.out.println("Привет, " + a + "!");
        System.out.println("Почти Джедай!!!");
    }

    // 8. * Написать метод, который определяет является ли год високосным,
// и выводит сообщение в консоль. Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void check_year(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " - не високосный.");
        } else {
            System.out.println(year + " - високосный.");
        }
    }

}