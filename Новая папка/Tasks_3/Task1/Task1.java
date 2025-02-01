public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = i + 1;
        }

        for (int i = 2, j = 8; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
