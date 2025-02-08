public class Task8 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello, how are you?";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с буквы и заканчивается знаком "?"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и длина строки больше 1
        if (str == null || str.length() < 2) {
            return false;
        }

        // Проверяем, что первый символ - это буква латинского алфавита
        char firstChar = str.charAt(0);
        if (!Character.isLetter(firstChar) || !Character.isAlphabetic(firstChar)) {
            return false; // Если первый символ не буква
        }

        // Проверяем, что строка заканчивается знаком "?"
        return str.charAt(str.length() - 1) == '?';
    }
}
