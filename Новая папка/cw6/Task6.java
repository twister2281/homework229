public class Task6 {
    public static void main(String[] args) {
        // Пример строки для проверки
        String str = "-123.45";

        // Проверяем, является ли строка вещественным числом
        boolean isValid = isRealNumber(str);

        // Выводим результат
        System.out.println("Строка является вещественным числом: " + isValid);
    }

    // Метод для проверки, является ли строка вещественным числом
    public static boolean isRealNumber(String str) {
        // Проверяем, что строка не пуста
        if (str == null || str.isEmpty()) {
            return false; // Пустая строка не может быть вещественным числом
        }
        
        // Флаг для проверки наличия десятичной точки
        boolean hasDecimalPoint = false;
        
        // Проходим по каждому символу строки
        for (char c : str.toCharArray()) {
            // Если символ - это десятичная точка
            if (c == '.' && !hasDecimalPoint) {
                hasDecimalPoint = true; // Обозначаем, что точка уже встречалась
            } 
            // Если символ не цифра, не знак + или -, не точка
            else if (!Character.isDigit(c) && c != '+' && c != '-' && c != '.') {
                return false; // Если нашли неподобающий символ, возвращаем false
            }
        }

        // Возвращаем true только если строка содержит хотя бы одну цифру и одну точку
        return hasDecimalPoint;  
    }
}
