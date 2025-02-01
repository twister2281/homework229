import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if (x != y && y != z && x != z && x + y + z < 1) {
            if (x < y && x < z) {
                x = (y + z) / 2;
            } else if (y < x && y < z) {
                y = (x + z) / 2;
            } else {
                z = (x + y) / 2;
            }
        } else {
            if (x < y) {
                x = (y + z) / 2;
            } else {
                y = (x + z) / 2;
            }
        }

        System.out.println("Результат: x = " + x + ", y = " + y + ", z = " + z);
    }
}
