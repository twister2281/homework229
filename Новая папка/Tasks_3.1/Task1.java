package Tasks_3.1;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {5, 1, 3, 5, 2}; // Пример массива
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a[maxIndex]) maxIndex = i;
            if (a[i] < a[minIndex]) minIndex = i;
        }

        System.out.println("Индекс последнего максимума: " + maxIndex);
        System.out.println("Индекс первого минимума: " + minIndex);
    }
}