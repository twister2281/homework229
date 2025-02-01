package Tasks_4;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int rows = 3;
        int[][] array = new int[rows][];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = random.nextInt(101);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
