public class Task4 {
    public static void main(String[] args) {
        // Пример строк для проверки
        String[] numbers = {"123", "-456", "+789", "12.34", "abc", "-001", "+000"};

        // Проверка каждой строки на целое число
        for (String num : numbers) {
            if (isInteger(num)) {
                System.out.println(num + " является целым числом.");
            } else {
                System.out.println(num + " не является целым числом.");
            }
        }
    }

    // Метод для проверки, является ли строка целым числом
    public static boolean isInteger(String str) {
        // Проверяем, начинается ли строка с символа + или - (опционально)
        if (str.isEmpty()) {
            return false;
        }

        int startIndex = 0;

        // Если строка начинается с + или -, пропускаем эти символы
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            startIndex = 1;
        }

        // Проходим по всем символам строки, начиная с нужного индекса
        for (int i = startIndex; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Если встречаем не цифру, строка не является целым числом
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
