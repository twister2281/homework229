package Tasks_4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        // Инициализация массива
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Элементы выше главной диагонали
        int[] aboveMainDiagonal = aboveMainDiagonal(array);
        System.out.println("Элементы выше главной диагонали: " + Arrays.toString(aboveMainDiagonal));

        // Элементы ниже главной диагонали
        int[] belowMainDiagonal = belowMainDiagonal(array);
        System.out.println("Элементы ниже главной диагонали: " + Arrays.toString(belowMainDiagonal));

        // Элементы выше побочной диагонали
        int[] aboveSecondaryDiagonal = aboveSecondaryDiagonal(array);
        System.out.println("Элементы выше побочной диагонали: " + Arrays.toString(aboveSecondaryDiagonal));

        // Элементы ниже побочной диагонали
        int[] belowSecondaryDiagonal = belowSecondaryDiagonal(array);
        System.out.println("Элементы ниже побочной диагонали: " + Arrays.toString(belowSecondaryDiagonal));
    }

    // Элементы выше главной диагонали
    public static int[] aboveMainDiagonal(int[][] array) {
        // Количество элементов выше главной диагонали
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        
        // Перебираем элементы выше главной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    // Элементы ниже главной диагонали
    public static int[] belowMainDiagonal(int[][] array) {
        // Количество элементов ниже главной диагонали
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        
        // Перебираем элементы ниже главной диагонали
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    // Элементы выше побочной диагонали
    public static int[] aboveSecondaryDiagonal(int[][] array) {
        // Количество элементов выше побочной диагонали
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        
        // Перебираем элементы выше побочной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - i - 1; j < array[i].length; j++) { // Исправленный индекс
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    // Элементы ниже побочной диагонали
    public static int[] belowSecondaryDiagonal(int[][] array) {
        // Количество элементов ниже побочной диагонали
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        
        // Перебираем элементы ниже побочной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - i - 2; j >= 0; j--) { // Исправленный индекс
                result[index++] = array[i][j];
            }
        }
        return result;
    }
}
