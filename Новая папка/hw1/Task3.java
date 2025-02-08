public class Task3 {
    public static void main(String[] args) {
        int m = 5; // Примерное значение
        int n = 7; // Примерное значение
        
        final double PI = 3.141592653589793;

        // Вычисление обеих дробей
        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        // Определяем, какая из дробей ближе к PI
        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            m *= 10;
            System.out.println("Число m умножено на 10: " + m);
        } else {
            n *= 2;
            System.out.println("Число n удвоено: " + n);
        }
    }
}
