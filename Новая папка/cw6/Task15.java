public class Task15 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "A12345 complete";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка начинается с буквы, за которой идут числа, и заканчивается словом "complete"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет минимальную длину (буква + числа + "complete")
        if (str == null || str.length() < 9) {
            return false;
        }

        // Проверяем, что строка заканчивается словом "complete"
        if (!str.endsWith("complete")) {
            return false;
        }

        // Проверяем, что строка начинается с буквы
        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }

        // Проверяем, что за первой буквой идут только цифры
        String numberPart = str.substring(1, str.length() - 8); // Извлекаем часть строки между буквой и "complete"
        for (int i = 0; i < numberPart.length(); i++) {
            if (!Character.isDigit(numberPart.charAt(i))) {
                return false; // Если встретился нецифровой символ, возвращаем false
            }
        }

        return true; // Все проверки прошли успешно
    }
}
