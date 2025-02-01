import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите количество элементов последовательности (n >= 3): ");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Ошибка: n должно быть >= 3");
            return;
        }

        int[] a = new int[n];
        System.out.println("Введите " + n + " целых чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxPairIndex1 = -1, maxPairIndex2 = -1;
        int minPairIndex1 = -1, minPairIndex2 = -1;

        for (int i = 0; i < n - 1; i++) {
            int sum = a[i] + a[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
                maxPairIndex1 = i + 1;
                maxPairIndex2 = i + 2;
            }

            if (sum <= minSum) { 
                minSum = sum;
                minPairIndex1 = i + 1;
                minPairIndex2 = i + 2;
            }
        }

        System.out.println("a) Максимальная сумма двух соседних чисел: " + maxSum);
        System.out.println("б) Минимальная сумма двух соседних чисел: " + minSum);
        System.out.println("в) Номера чисел с максимальной суммой: " + maxPairIndex1 + ", " + maxPairIndex2);
        System.out.println("г) Номера чисел с минимальной суммой: " + minPairIndex1 + ", " + minPairIndex2);
    }
}
