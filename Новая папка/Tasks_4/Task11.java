package Tasks_4;

public class Task11 {
    public static void main(String[] args) {
        int rows = 4;
        int[][] array = new int[rows][];

        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = i * j;
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
