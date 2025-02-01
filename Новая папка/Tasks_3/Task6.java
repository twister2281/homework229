public class Task6 {
    public static void main(String[] args) {
        int a = 2; 
        int p = 3; 
        int[] arithmeticProgression = new int[10];
        for (int i = 0; i < arithmeticProgression.length; i++) {
            arithmeticProgression[i] = a + i * p;
        }
        System.out.println("Арифметическая прогрессия: ");
        for (int num : arithmeticProgression) {
            System.out.print(num + " ");
        }
        System.out.println();

       
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Последовательность Фибоначчи: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}
