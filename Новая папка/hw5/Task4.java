import java.io.*;

public class Task4 {

    public static void processFileWithExceptions(String filePath) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                try {
                    Integer.parseInt(line);  // Проверяем, может ли строка быть числом
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка на строке " + lineNumber + ": не число");
                }
                lineNumber++;
            }
            if (lineNumber == 1) {
                throw new Exception("Файл пуст");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            processFileWithExceptions("test.txt");  // Пример вызова метода
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
