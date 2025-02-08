import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество чисел
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Вводим последовательность чисел
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        // Ищем локальные максимумы
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i] % 2 == 0) {
                count++;
            }
        }

        // Проверка, что ровно два четких локальных максимума
        if (count == 2) {
            System.out.println("Есть два четких локальных максимума");
        } else {
            System.out.println("Нету двух четких локальных максимумов");
        }
    }
}
