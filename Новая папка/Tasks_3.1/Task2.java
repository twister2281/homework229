package Tasks_3.1;

public class Task2 {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {3, 4}, {5, 6}}; // Пример данных
        int maxSum = Integer.MIN_VALUE;
        int minProduct = Integer.MAX_VALUE;

        for (int[] pair : pairs) {
            maxSum = Math.max(maxSum, pair[0] + pair[1]);
            minProduct = Math.min(minProduct, pair[0] * pair[1]);
        }

        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Минимальное произведение: " + minProduct);
    }
}