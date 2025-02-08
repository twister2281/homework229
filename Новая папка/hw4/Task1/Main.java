package Task1;

public class Main {  // Главный класс для тестирования
    public static void main(String[] args) {
        Entity[] animals = {  // Массив объектов
            new Cat("Мурка", 1, "Персидская"),  // Кошка
            new Dog("Шерлок", 2, 3)  // Собака
        };

        for (Entity animal : animals) {  // Перебор животных
            animal.display();  // Отображаем информацию о животном
            animal.performAction();  // Выполняем действие для каждого животного
        }
    }
}