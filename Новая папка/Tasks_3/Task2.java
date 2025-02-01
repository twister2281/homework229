public class Task2 {
    public static void main(String[] args) {
        int[] array = {-5, 3, -2, 8, -1, 4, -3, 6};
        int firstNegative = -1, lastPositive = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && firstNegative == -1) {
                firstNegative = i;
            }
            if (array[i] > 0) {
                lastPositive = i;
            }
        }

        if (firstNegative != -1 && lastPositive != -1) {
            int temp = array[firstNegative];
            array[firstNegative] = array[lastPositive];
            array[lastPositive] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
