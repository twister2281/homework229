public class Task1 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "Hello123";

        // Проверяем строку
        boolean containsDigit = containsDigit(str);

        // Выводим результат
        System.out.println("Строка содержит хотя бы одну цифру: " + containsDigit);
    }

    // Метод для проверки, что строка содержит хотя бы одну цифру
    public static boolean containsDigit(String str) {
        // Проверяем строку на null
        if (str == null) {
            return false;
        }

        // Проходим по всем символам строки
        for (char c : str.toCharArray()) {
            // Если встречаем цифру, возвращаем true
            if (Character.isDigit(c)) {
                return true;
            }
        }

        // Если не нашли ни одной цифры
        return false;
    }
}
