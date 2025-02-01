package Tasks_5;

public class Task7 {
    public static void main(String[] args) {
        String text = "  2357 12389";
        int maxDigit = -1;
        int index = -1;
        
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                int digit = Character.getNumericValue(text.charAt(i));
                if (digit > maxDigit) {
                    maxDigit = digit;
                    index = i;
                }
            }
        }

        System.out.println("Порядковый номер максимальной цифры: " + (index + 1));
    }
}
