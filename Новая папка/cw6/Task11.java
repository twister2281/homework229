public class Task11 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello World!";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с заглавной буквы и заканчивается восклицательным знаком
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и ее длина больше или равна 2 (заглавная буква + восклицательный знак)
        if (str == null || str.length() < 2) {
            return false;
        }

        // Проверяем, что первый символ строки - заглавная буква
        if (!Character.isUpperCase(str.charAt(0))) {
            return false;
        }

        // Проверяем, что последний символ строки - восклицательный знак
        return str.charAt(str.length() - 1) == '!';
    }
}
