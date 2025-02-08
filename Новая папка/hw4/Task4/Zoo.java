package Task4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    // Метод для добавления животного в зоопарк
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Метод для издания звуков всеми животными
    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // Метод для кормления всех животных указанным кормом
    public void feedAll(String foodType) {
        for (Animal animal : animals) {
            animal.eat(foodType);
        }
    }
}
