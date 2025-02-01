import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Начните вводить числа:");
        int prev = scanner.nextInt();

        while (true) {
            int current = scanner.nextInt();
            if (current < prev) {
                System.out.println("Ввод прерван. Последнее число: " + current);
                break;
            }
            prev = current;
        }
    }
}
