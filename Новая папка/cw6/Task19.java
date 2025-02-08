public class Task19 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "hello World";

        // Проверяем строку
        boolean containsUppercase = containsUppercase(str);

        // Выводим результат
        System.out.println("Строка содержит хотя бы одну прописную букву: " + containsUppercase);
    }

    // Метод для проверки, что строка содержит хотя бы одну прописную букву
    public static boolean containsUppercase(String str) {
        // Проверяем строку на null
        if (str == null) {
            return false;
        }

        // Проходим по всем символам строки
        for (char c : str.toCharArray()) {
            // Если встречаем прописную букву, возвращаем true
            if (Character.isUpperCase(c)) {
                return true;
            }
        }

        // Если не нашли ни одной прописной буквы
        return false;
    }
}
