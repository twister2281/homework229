package Tasks_3.1;

public class Task5 {
    public static void main(String[] args) {
        int K = 3;
        int[] numbers = {1, 2, 4, 0}; // Пример набора чисел
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > K) {
                index = i + 1;
                break;
            }
        }

        System.out.println("Индекс первого числа больше K: " + index);
    }
}