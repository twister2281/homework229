import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Переменная для хранения суммы положительных четных чисел
        int sum = 0; 

        // Сообщение для пользователя о вводе чисел
        System.out.println("Введите ненулевые целые числа (для завершения введите 0):");

        // Бесконечный цикл, продолжающийся до ввода 0
        while (true) {
            // Ввод числа пользователем
            int num = scanner.nextInt();

            // Если введено 0, завершаем цикл
            if (num == 0) { 
                break;
            }

            // Если число положительное и четное, добавляем его к сумме
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }

        // Выводим результат - сумму положительных четных чисел
        System.out.println("Сумма всех положительных четных чисел: " + sum);
    }
}
