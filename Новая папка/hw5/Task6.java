import java.util.*;
import java.util.regex.*;

public class Task6 {

    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "Сегодня 01.01.2020 и завтра 31.12.2025";
        List<String> dates = extractDates(text);
        System.out.println("Извлеченные даты: " + dates);
    }
}
