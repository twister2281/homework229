import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество чисел
        int n = scanner.nextInt();
        double[] arr = new double[n];

        // Вводим числа и изменяем их в зависимости от знака
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            if (arr[i] < 0) {
                arr[i] += 0.5; // Увеличиваем на 0.5
            } else {
                arr[i] = 0.1; // Заменяем на 0.1
            }
        }

        // Выводим измененную последовательность
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}
