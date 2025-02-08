import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество чисел
        int n = scanner.nextInt();
        int count = 0;

        // Вводим последовательность чисел
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            // Преобразуем число в строку, чтобы проверять его длину
            String numStr = Integer.toString(num);

            // Проверяем длину числа и его цифры
            if ((numStr.length() == 3 || numStr.length() == 5) && isValid(num)) {
                count++;
            }
        }

        // Проверка, что найдено ровно два подходящих числа
        if (count == 2) {
            System.out.println("Найдено два числа, удовлетворяющие условиям");
        } else {
            System.out.println("Не найдено два числа, удовлетворяющие условиям");
        }
    }

    // Метод для проверки, что все цифры числа четные или все нечетные
    public static boolean isValid(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        boolean allEven = true;
        boolean allOdd = true;
        
        for (int digit : digits) {
            if (digit % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }
        }
        
        return allEven || allOdd;
    }
}
