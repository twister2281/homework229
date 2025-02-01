public class Task9 {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 6, 1};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        System.out.println("Последний элемент массива: " + array[array.length - 1]);
    }
}
