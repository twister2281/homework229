package Tasks_3.1;

public class Task6 {
    public static void main(String[] args) {
        // Подзадача a
        int a = 2, p = 3;
        int[] progression = new int[10];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = a + i * p;
        }
        System.out.println("Арифметическая прогрессия: " + java.util.Arrays.toString(progression));

        // Подзадача b
        int[] fibonacci = new int[20];
        fibonacci[0] = fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Последовательность Фибоначчи: " + java.util.Arrays.toString(fibonacci));
    }
}