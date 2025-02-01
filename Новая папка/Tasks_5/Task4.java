package Tasks_5;

public class Task4 {
    public static void main(String[] args) {
        String sequence = "aaaaabcde";
        char firstChar = sequence.charAt(0);
        int count = 0;
        
        while (count < sequence.length() && sequence.charAt(count) == firstChar) {
            count++;
        }
        
        System.out.println("Количество одинаковых символов в начале: " + count);
    }
}
