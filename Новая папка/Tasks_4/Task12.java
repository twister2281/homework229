package Tasks_4;

public class Task12 {
    public static void main(String[] args) {
        int rows = 3;
        int[][] array = new int[rows][];
        array[0] = new int[] {1};
        array[1] = new int[] {2, 3};
        array[2] = new int[] {4, 5, 6};

        int sum = sumElements(array);
        System.out.println("Сумма всех элементов: " + sum);
    }

    public static int sumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
