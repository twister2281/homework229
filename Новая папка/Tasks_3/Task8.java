import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 2, 4, 6, 8, 1, 10};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) minIndex = i + 1;
        }

        System.out.println("a) Максимальный элемент: " + max + ", второй максимум: " + secondMax);
        System.out.println("b) Минимальный элемент: " + min + ", второй минимум: " + secondMin);
        System.out.println("c) Индекс минимального элемента: " + minIndex);
    }
}
