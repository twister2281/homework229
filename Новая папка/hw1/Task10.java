import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число n
        int n = scanner.nextInt();

        // Определяем правильную форму слова "год"
        if (n % 10 == 1 && n % 100 != 11) {
            System.out.println(n + " год");
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            System.out.println(n + " года");
        } else {
            System.out.println(n + " лет");
        }
    }
}
