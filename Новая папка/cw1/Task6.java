import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("Числа из интервала (1, 3):");
        if (a > 1 && a < 3) System.out.println(a);
        if (b > 1 && b < 3) System.out.println(b);
        if (c > 1 && c < 3) System.out.println(c);
    }
}
