import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        int sum = 0;
        int product = 1;
        int sumOfSquares = 0;

        for (int num : array) {
            sum += num;
            product *= num;
            sumOfSquares += num * num;
        }

        int sumOfFirstSix = 0;
        for (int i = 0; i < 6; i++) {
            sumOfFirstSix += array[i];
        }

        System.out.println("Введите k1 и k2 (k2 > k1): ");
        int k1 = scanner.nextInt() - 1;
        int k2 = scanner.nextInt() - 1;
        int rangeSum = 0;
        for (int i = k1; i <= k2; i++) {
            rangeSum += array[i];
        }

        double avg = (double) sum / array.length;

        System.out.println("Введите s1 и s2 (s2 > s1): ");
        int s1 = scanner.nextInt() - 1;
        int s2 = scanner.nextInt() - 1;
        int subSum = 0;
        for (int i = s1; i <= s2; i++) {
            subSum += array[i];
        }
        double subAvg = (double) subSum / (s2 - s1 + 1);

        System.out.println("a) Сумма всех элементов: " + sum);
        System.out.println("b) Произведение всех элементов: " + product);
        System.out.println("c) Сумма квадратов всех элементов: " + sumOfSquares);
        System.out.println("d) Сумма первых шести элементов: " + sumOfFirstSix);
        System.out.println("e) Сумма с " + (k1 + 1) + "-го по " + (k2 + 1) + "-й элемент: " + rangeSum);
        System.out.println("f) Среднее арифметическое всех элементов: " + avg);
        System.out.println("g) Среднее арифметическое с " + (s1 + 1) + "-го по " + (s2 + 1) + "-й элемент: " + subAvg);
    }
}
