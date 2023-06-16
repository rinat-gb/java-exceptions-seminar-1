package ru.gb;

import java.util.Arrays;

/**
 * 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
 * и возвращающий новый массив, каждый элемент которого равен разности элементов
 * двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array0 = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[]{5, 4, 3, 2, 1};

        System.out.println("Первый входной массив: " + Arrays.toString(array0));
        System.out.println("Второй входной массив: " + Arrays.toString(array1));

        int[] result = arrayDifference(array0, array1);
        System.out.println("Результирующий массив: " + Arrays.toString(result));
    }

    public static int[] arrayDifference(int[] array0, int[] array1) {
        if (array0 == null)
            throw new IllegalArgumentException("Отсутствует первый массив");

        if (array1 == null)
            throw new IllegalArgumentException("Отсутствует второй массив");

        if (array0.length != array1.length)
            throw new IllegalArgumentException("Размеры входных массивов не совпадают");

        int[] result = new int[array0.length];
        for (int i = 0; i < array0.length; i++) {
            result[i] = array0[i] - array1[i];
        }
        return result;
    }
}
