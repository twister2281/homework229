package Tasks_4;

public class Task14 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;

        int index = linearSearch(array, target);
        if (index == -1) {
            System.out.println("Элемент не найден");
        } else {
            System.out.println("Элемент найден на позиции: " + index);
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
