import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество элементов в массиве
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Заполняем массив чередующимися числами
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = 1 + 2 * (i / 2); // Четные индексы: 1, 5, 9, ...
            } else {
                arr[i] = -3 - 2 * (i / 2); // Нечетные индексы: -3, -7, -11, ...
            }
        }

        // Выводим массив
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
