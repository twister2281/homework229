import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа n
        System.out.print("Введите натуральное число (n <= 999999): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 999999) {
            System.out.println("Ошибка: число должно быть в диапазоне от 0 до 999999.");
            return;
        }

        int[] digits = new int[6]; // Массив из 6 элементов (максимальное количество цифр)
        int index = 0;

        // Заполнение массива цифрами в обратном порядке
        while (n > 0) {
            digits[index++] = n % 10;
            n /= 10;
        }

        // Вывод массива (только цифры числа n)
        System.out.print("Цифры в обратном порядке: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        
        scanner.close();
    }
}
