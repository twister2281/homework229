import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        swap(array, 1, 4);

        swap(array, 2, 7);

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        swap(array, 2, maxIndex);

        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[minIndex]) minIndex = i;
        }
        swap(array, 0, minIndex);

        System.out.println("Итоговый массив: " + Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
