package Task4;

public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Трубление слона: Пфуууу!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Слон ест " + foodType);
    }

    // Специфичный метод для слона
    public void playWater() {
        System.out.println("Слон играет с водой!");
    }
}
