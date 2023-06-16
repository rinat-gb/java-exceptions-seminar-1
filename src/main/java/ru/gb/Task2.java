package ru.gb;

/**
 * 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[][] {
                {"1", "2", "3", "1", "1"},
                {"1", "1", "2", "3", "1"},
                {"1", "1", "1", "2", "3"},
                {"1", "2", "3", "1", "1"},
                {"1", "1", "2", "3", "1"}
        };
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;

        // тут мы можем получить NullPointerException
        // если в качестве параметра передано пустое (null) значение
        for (int i = 0; i < arr.length; i++) {

            // тут мы можем получить ArrayIndexOfBounds
            // если в какой-то из строк переданного массива меньше чем 5 символов
            for (int j = 0; j < 5; j++) {

                // тут мы можем получить NumberFormatException
                // если передана не строка с корректным целым числом, а в строке встречается, скажем, буква
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}