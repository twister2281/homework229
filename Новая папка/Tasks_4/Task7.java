package Tasks_4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sumArray = sumArrays(array1, array2);
        System.out.println("Сумма массивов:");
        printArray(sumArray);

        int[][] signCheckArray = checkSigns(array1, array2);
        System.out.println("Проверка знаков:");
        printArray(signCheckArray);
    }

    public static int[][] sumArrays(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    public static int[][] checkSigns(int[][] array1, int[][] array2) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if ((array1[i][j] >= 0 && array2[i][j] >= 0) || (array1[i][j] < 0 && array2[i][j] < 0)) {
                    result[i][j] = 100;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
