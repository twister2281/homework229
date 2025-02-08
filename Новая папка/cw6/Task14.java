public class Task14 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "123456 done";

        // Проверяем строку
        boolean isValid = isValidString(str);

        // Выводим результат
        System.out.println("Строка соответствует условию: " + isValid);
    }

    // Метод для проверки, что строка состоит только из цифр и заканчивается словом "done"
    public static boolean isValidString(String str) {
        // Проверяем, что строка не пуста и имеет минимальную длину (цифры + "done")
        if (str == null || str.length() < 5) {
            return false;
        }

        // Проверяем, что строка заканчивается словом "done"
        if (!str.endsWith("done")) {
            return false;
        }

        // Проверяем, что все символы до "done" являются цифрами
        String numberPart = str.substring(0, str.length() - 4); // Извлекаем часть строки до "done"
        for (int i = 0; i < numberPart.length(); i++) {
            if (!Character.isDigit(numberPart.charAt(i))) {
                return false; // Если встретился нецифровой символ, возвращаем false
            }
        }

        return true; // Все проверки прошли успешно
    }
}
