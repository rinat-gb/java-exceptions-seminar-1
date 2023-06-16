package ru.gb;

/**
 * 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {
    public static void main(String[] args) {
//        ThrowsNullPointerException();
//        ThrowsArrayIndexOutOfBoundsException();
//        ThrowsArithmeticException();
    }

    public static void ThrowsNullPointerException() {
        int[] array = null;

        // вот тут будет NullPointerException потому что массив нулевой
        System.out.println(array[0]);
    }

    public static void ThrowsArrayIndexOutOfBoundsException() {
        int[] array = new int[5];

        // вот тут будет ArrayIndexOutOfBoundsException потому что
        // выполняется обращение явно за пределы массива
        array[array.length] = 1;
    }

    public static void ThrowsArithmeticException() {
        int a = 5;
        int b = 0;

        // вот тут будет ArithmeticException потому что деление на ноль
        int c = a / b;
    }
}
