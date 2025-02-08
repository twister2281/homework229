import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа K
        System.out.print("Введите число K: ");
        int K = scanner.nextInt();

        // Сообщение о вводе чисел
        System.out.println("Введите ненулевые целые числа (для завершения введите 0):");

        // Переменные для отслеживания индекса и позиции первого числа, большего K
        int index = 0, position = 0;

        // Бесконечный цикл, продолжающийся до ввода 0
        while (true) {
            int num = scanner.nextInt();
            
            // Если введено 0, завершаем цикл
            if (num == 0) break;
            
            // Увеличиваем индекс для отслеживания позиции
            index++;
            
            // Если найдено первое число больше K, сохраняем его позицию
            if (num > K && position == 0) {
                position = index;
            }
        }

        // Выводим позицию первого числа, большего K
        System.out.println("Номер первого числа, большего K: " + position);
    }
}
