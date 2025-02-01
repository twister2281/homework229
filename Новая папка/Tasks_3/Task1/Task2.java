import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите k: ");
        int k = scanner.nextInt();
        System.out.print("Введите s: ");
        int s = scanner.nextInt();

        for (int i = k + 1, j = s - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
