public class Task12 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello there done";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с буквы и заканчивается словом "done"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и ее длина больше или равна 4 (для первой буквы + "done")
        if (str == null || str.length() < 4) {
            return false;
        }

        // Проверяем, что первый символ строки - буква
        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }

        // Проверяем, что строка заканчивается словом "done"
        return str.endsWith("done");
    }
}
