import java.io.*;

public class Task1 {

    public static void countWordsInFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;  // Разделяем строку на слова по пробелам и считаем их количество
            }
            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        countWordsInFile("test.txt");  // Пример вызова метода
    }
}
