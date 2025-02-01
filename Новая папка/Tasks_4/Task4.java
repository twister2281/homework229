package Tasks_4;

import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        int cols = array[0].length;
        int rows = array.length;

        boolean hasZeroColumn = false;
        for (int j = 0; j < cols; j++) {
            boolean allZero = true;
            for (int i = 0; i < rows; i++) {
                if (array[i][j] != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                hasZeroColumn = true;
                break;
            }
        }
        System.out.println("Есть столбец из нулей: " + hasZeroColumn);
    }
}
