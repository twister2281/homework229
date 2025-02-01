import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число K: ");
        int K = scanner.nextInt();

        System.out.println("Введите ненулевые целые числа (для завершения введите 0):");

        int index = 0, position = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            index++;
            if (num > K && position == 0) {
                position = index;
            }
        }

        System.out.println("Номер первого числа, большего K: " + position);
    }
}
