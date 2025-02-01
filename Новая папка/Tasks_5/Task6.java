package Tasks_5;

public class Task6 {
    public static void main(String[] args) {
        String word1 = "процессор";
        String word2 = "процес";
        
        int count = 0;
        int minLength = Math.min(word1.length(), word2.length());
        
        while (count < minLength && word1.charAt(count) == word2.charAt(count)) {
            count++;
        }

        System.out.println("Количество совпадающих начальных букв: " + count);
    }
}
