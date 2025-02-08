import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Создаём объект Scanner для получения ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем количество чисел n
        System.out.println("Введите количество чисел n:");
        int n = scanner.nextInt();

        // Переменная для подсчёта чисел, которые удовлетворяют условиям
        int count = 0;

        // Массив для ввода чисел
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            // Определяем длину числа
            int length = String.valueOf(Math.abs(num)).length();
            
            // Флаги для проверки, все ли цифры чётные или все нечётные
            boolean allEven = true;
            boolean allOdd = true;

            // Перебираем цифры числа
            int temp = Math.abs(num);
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    allOdd = false;  // Если цифра чётная, меняем флаг
                } else {
                    allEven = false;  // Если цифра нечётная, меняем флаг
                }
                temp /= 10;  // Убираем последнюю цифру
            }

            // Проверяем длину числа и флаги чётности цифр
            if ((length == 3 || length == 5) && (allEven || allOdd)) {
                count++;  // Увеличиваем счётчик, если число удовлетворяет условиям
            }
        }

        // Выводим результат
        if (count == 2) {
            System.out.println("Ровно два числа соответствуют условиям.");
        } else {
            System.out.println("Условию соответствуют " + count + " числа.");
        }
    }
}
