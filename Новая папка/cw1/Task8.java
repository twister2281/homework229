import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четыре числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (a <= b && b <= c && c <= d) {
            double max = Math.max(Math.max(a, b), Math.max(c, d));
            a = b = c = d = max;
        } else if (!(a > b && b > c && c > d)) {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
        }

        System.out.println("Результат: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
