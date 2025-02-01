package Tasks_4;

public class Task13 {
    public static void main(String[] args) {
        int rows = 4;
        int[][] array = new int[rows][];
        array[0] = new int[] {1};
        array[1] = new int[] {2, 3};
        array[2] = new int[] {4, 5, 6};
        array[3] = new int[] {7, 8, 9};

        int[] maxElement = findMaxElement(array);
        System.out.println("Максимальный элемент: " + maxElement[0] + " на позиции (" + maxElement[1] + ", " + maxElement[2] + ")");
    }

    public static int[] findMaxElement(int[][] array) {
        int max = Integer.MIN_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{max, row, col};
    }
}
