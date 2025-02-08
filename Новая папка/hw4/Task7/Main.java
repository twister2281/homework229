package Task7;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7};

        System.out.println("Сумма: " + ArrayUtils.getSum(numbers));
        System.out.println("Среднее арифметическое: " + ArrayUtils.average(numbers));
        System.out.println("Максимальное значение: " + ArrayUtils.max_value(numbers));
        System.out.println("Минимальное значение: " + ArrayUtils.min_value(numbers));
        System.out.println("Мода: " + ArrayUtils.mode(numbers));

        int[] sortedNumbers = ArrayUtils.sort_ascending(numbers);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}
