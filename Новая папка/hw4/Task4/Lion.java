package Task4;

public class Lion implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Рычание льва: Ррррр!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Лев ест " + foodType);
    }

    // Специфичный метод для льва
    public void hunt() {
        System.out.println("Лев идет на охоту...");
    }
}
