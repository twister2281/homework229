public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 8, 2, 6, 1, 9, 4, 0, 11, 10, 15, 12, 13};
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        for (int i = minIndex, j = maxIndex; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
