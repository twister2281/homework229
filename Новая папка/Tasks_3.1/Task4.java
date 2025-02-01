package Tasks_3.1;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -3, 0}; // Пример набора чисел
        int sum = 0;

        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) sum += num;
        }

        System.out.println("Сумма положительных четных чисел: " + sum);
    }
}
