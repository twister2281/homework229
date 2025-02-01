package Tasks_4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] evenInColumns = firstEvenInColumns(array);
        System.out.println("Первые четные элементы столбцов: " + Arrays.toString(evenInColumns));

        int[] oddInRows = lastOddInRows(array);
        System.out.println("Последние нечетные элементы строк: " + Arrays.toString(oddInRows));
    }

    public static int[] firstEvenInColumns(int[][] array) {
        int[] result = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            result[j] = 0; 
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 == 0) {
                    result[j] = array[i][j];
                    break;
                }
            }
        }
        return result;
    }

    public static int[] lastOddInRows(int[][] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = 0; 
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] % 2 != 0) {
                    result[i] = array[i][j];
                    break;
                }
            }
        }
        return result;
    }
}
