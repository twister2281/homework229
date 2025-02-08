import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем размер массива n
        System.out.println("Введите размер массива n:");
        int n = scanner.nextInt();

        // Проверка, что n — положительное число
        if (n <= 0) {
            System.out.println("Ошибка: n должно быть натуральным числом.");
            return;
        }

        // Создаём массив целых чисел
        int[] array = new int[n];

        // Заполняем массив с чередующимися положительными и отрицательными нечетными числами
        for (int i = 0; i < n; i++) {
            array[i] = (i % 2 == 0) ? (i * 2 + 1) : -(i * 2 + 1);
        }

        // Выводим полученный массив
        System.out.println("Полученный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
