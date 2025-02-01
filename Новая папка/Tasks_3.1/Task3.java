package Tasks_3.1;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // Пример массива
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
            if (sum <= minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        System.out.println("Максимальная сумма: " + maxSum + ", индексы: " + maxIndex + ", " + (maxIndex + 1));
        System.out.println("Минимальная сумма: " + minSum + ", индексы: " + minIndex + ", " + (minIndex + 1));
    }
}