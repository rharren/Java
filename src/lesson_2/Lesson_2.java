package lesson_2;
import java.util.Arrays;
/**
 * Date 26.01.2022
 * made by rharren-
 * level 1 lesson 2 homework
 */
//shift+f6 изменение имен
//ctr+K коммит
public class Lesson_2 {

    public static void main(String[] args) {
        // testing
        System.out.println(Arrays.toString(ex_0())); // return link to array in memory
        // that has to be converted to String to show as array

        System.out.println(ex_0_1());  // return String not array
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println(Arrays.toString(ex_1()));
        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить
        // его значениями 0 3 6 9 12 15 18 21;
        System.out.println(Arrays.toString(ex_2()));
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println(Arrays.toString(ex_3()));
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        printArr(ex_4());
        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println(ex_5());
        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и
        // правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        // checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        System.out.println(ex_6(new int[]{1, 1, 1, 2, 1}));
        System.out.println(ex_6(new int[]{2, 1, 1, 2, 1}));
        System.out.println(ex_6(new int[]{10,10}));
        System.out.println(ex_6(new int[]{101}));
        //7. **** Написать метод, которому на вход подается одномерный массив и
        // число n (может быть положительным, или отрицательным), при этом метод должен сместить
        // все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, 1)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, -1)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2}, 1)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2}, -1)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, 6)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, -6)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, 8)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, -8)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, 2)));
        System.out.println(Arrays.toString(ex_7(new int[]{1,2,3,4,5}, 3)));


    }

    static int[] ex_0() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        return arr;
    }

    static String ex_0_1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        return Arrays.toString(arr);
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static int[] ex_1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else if ( arr[i] == 1){
                arr[i] = 0;
            } else{
                System.out.println("index " + i + "- has number not in 1 or 0! Check array!"); // for possible bug
            }
        }
        return arr;
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить
    // его значениями 0 3 6 9 12 15 18 21;
    static int[] ex_2() {
        int arr[] = new int [8] ;
        int j;
        int i;
        for(i = 0, j = 0; i < arr.length; i++, j = j + 3){
            arr[i] = j;
        }
        return arr;
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    static int[] ex_3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


    //Вспомогательный блок вывода
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] ex_4(){
        int [][]arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (i == j){
                    arr[i][j] = 1;
                } else if ( i + j == arr.length - 1 ) { // по условию это квадратный массив
                    arr[i][j] = 1;
                }

            }

        }
        return arr;

    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static String ex_5(){
        int [] arr = {1,3,-5,6,0,4,2,4,61};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return min +" "+ max;
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и
    // правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
    // checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
    // граница показана символами ||, эти символы в массив не входят.

    static boolean ex_6(int[]arr){
        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr.length >2){
                if (i <= arr.length / 2){
                    leftSide = leftSide + arr[i];
                }else{
                    rightSide = rightSide + arr[i];
                }
            } else if (arr.length == 2){
                leftSide = arr[0];
                rightSide = arr[1];
                break;
            } else {
                System.out.println("Error with array");
                return false;
            }
        }

        return leftSide == rightSide;
    }


    //7. **** Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    static int[] ex_7(int[]arr, int n){
        // check number n
        if (n > arr.length && n > 0){
            n = n % (arr.length);
        } else if (n * -1 > arr.length && n < 0){
            n = n % (arr.length);
        } else if (n == 0) {
            System.out.println("No shift needed, n = 0!");
            return arr;
        }
        //System.out.println(n);
        if ( n > 0){
            for ( int j = 0; j < n; j++){
                int tmp = arr[arr.length - 1];
                //System.out.println(n);
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[arr.length - 1 - i] = arr[arr.length - 1 - i - 1];
                }
                arr[0] = tmp;
            }

        } else if ( n < 0) {
            for ( int j = 0; j > n; j--) {
                int tmp = arr[0];
                //System.out.println(n);
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        return arr;
    }
}