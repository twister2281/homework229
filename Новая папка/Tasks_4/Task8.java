package Tasks_4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] aboveMainDiagonal = aboveMainDiagonal(array);
        System.out.println("Элементы выше главной диагонали: " + Arrays.toString(aboveMainDiagonal));

        int[] belowMainDiagonal = belowMainDiagonal(array);
        System.out.println("Элементы ниже главной диагонали: " + Arrays.toString(belowMainDiagonal));

        int[] aboveSecondaryDiagonal = aboveSecondaryDiagonal(array);
        System.out.println("Элементы выше побочной диагонали: " + Arrays.toString(aboveSecondaryDiagonal));

        int[] belowSecondaryDiagonal = belowSecondaryDiagonal(array);
        System.out.println("Элементы ниже побочной диагонали: " + Arrays.toString(belowSecondaryDiagonal));
    }

    public static int[] aboveMainDiagonal(int[][] array) {
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] belowMainDiagonal(int[][] array) {
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] aboveSecondaryDiagonal(int[][] array) {
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - i; j < array[i].length; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] belowSecondaryDiagonal(int[][] array) {
        int[] result = new int[(array.length * (array.length - 1)) / 2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - i - 1; j >= 0; j--) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }
}
