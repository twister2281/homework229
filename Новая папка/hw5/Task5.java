import java.io.*;
import java.util.regex.*;

public class Task5 {

    public static void validatePhoneNumber(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("^\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}$")) {
                    System.out.println("Номер телефона: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        validatePhoneNumber("test.txt");  // Пример вызова метода
    }
}
