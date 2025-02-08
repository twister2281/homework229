public class Task10 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello World";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка содержит только буквы и пробелы
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста
        if (str == null) {
            return false;
        }

        // Проходим по каждому символу строки
        for (char c : str.toCharArray()) {
            // Если символ не является буквой и не пробелом, возвращаем false
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        // Если все символы строки - буквы или пробелы, возвращаем true
        return true;
    }
}
