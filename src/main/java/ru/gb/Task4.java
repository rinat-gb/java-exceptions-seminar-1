package ru.gb;

import java.util.Arrays;
import java.util.Random;

/**
 * 4(*). Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
 * и возвращающий новый массив, каждый элемент которого равен частному элементов
 * двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * <p>
 * Важно: При выполнении метода единственное исключение, которое пользователь
 * может увидеть - RuntimeException, т.е. ваше.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array0 = new int[10];
        int[] array1 = new int[10];

        Random random = new Random();
        for (int i = 0; i < array0.length; i++) {
            array0[i] = random.nextInt(100);
            array1[i] = random.nextInt(100);
        }

        System.out.println("Первый входной массив: " + Arrays.toString(array0));
        System.out.println("Второй входной массив: " + Arrays.toString(array1));

        int[] result = arrayQuotient(array0, array1);

        if (result != null)
            System.out.println("Результирующий массив: " + Arrays.toString(result));
        else
            System.err.println("Произошла ошибка при вычислении результирующего массива");
    }

    public static int[] arrayQuotient(int[] array0, int[] array1) {
        if (array0 == null)
            throw new RuntimeException("Отсутствует первый массив");

        if (array1 == null)
            throw new RuntimeException("Отсутствует второй массив");

        if (array0.length != array1.length)
            throw new RuntimeException("Размеры входных массивов не совпадают");

        int[] result = new int[array0.length];
        try {
            for (int i = 0; i < array0.length; i++) {
                result[i] = array0[i] / array1[i];
            }
        } catch (ArithmeticException e) {
            // деление не удалось, возвращаем null из метода
            return null;
        }
        return result;
    }
}
