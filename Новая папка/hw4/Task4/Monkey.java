package Task4;

public class Monkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Крик обезьяны: Ууууу-у-у!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Обезьяна ест " + foodType);
    }

    // Специфичный метод для обезьяны
    public void swing() {
        System.out.println("Обезьяна качается на ветке!");
    }
}
