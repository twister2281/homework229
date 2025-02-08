public class Task5 {
    public static void main(String[] args) {
        // Пример строк для проверки
        String[] testStrings = {"123abcend", "987start", "0testend", "abc123end", "123end"};

        // Проверка каждой строки на соответствие заданному формату
        for (String str : testStrings) {
            if (startsWithNumberEndsWithEnd(str)) {
                System.out.println(str + " соответствует условию.");
            } else {
                System.out.println(str + " не соответствует условию.");
            }
        }
    }

    // Метод для проверки, что строка начинается с числа и заканчивается словом "end"
    public static boolean startsWithNumberEndsWithEnd(String str) {
        // Проверяем, что строка не пуста и начинается с цифры
        if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
            return false;
        }

        // Проверяем, что строка заканчивается на "end"
        return str.endsWith("end");
    }
}
