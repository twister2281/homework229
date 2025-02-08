package Task1;

abstract class Entity { // Абстрактный класс
    String name;  // Атрибут: имя
    int id;  // Атрибут: идентификатор

    // Конструктор 1: принимает имя и идентификатор
    public Entity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Конструктор 2: принимает только имя (идентификатор по умолчанию - 0)
    public Entity(String name) {
        this(name, 0); // Использует конструктор 1
    }

    // Неабстрактный метод: вывод информации об объекте
    public void displayInfo() {
        System.out.println("Имя: " + name + ", ID: " + id);
    }

    // Неабстрактный метод: отображение сущности
    public void display() {
        System.out.println("Отображение сущности...");
    }

    // Абстрактный метод: выполняет действие (определяется в дочерних классах)
    public abstract void performAction();
}