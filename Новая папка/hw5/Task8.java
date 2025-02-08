public class Task8 {

    public static boolean isAllDigits(String text) {
        return text.matches("\\d+");
    }

    public static void main(String[] args) {
        System.out.println(isAllDigits("12345"));  // Пример вызова метода
        System.out.println(isAllDigits("123a45"));
    }
}
