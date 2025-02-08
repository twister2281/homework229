package Task1;

class Dog extends Entity {  // Класс для собаки
    int age;  // Атрибут: возраст собаки

    // Конструктор собаки: имя, идентификатор, возраст
    public Dog(String name, int id, int age) {
        super(name, id);  // Используем конструктор родителя
        this.age = age;
    }

    // Конструктор собаки: имя и возраст (идентификатор по умолчанию - 0)
    public Dog(String name, int age) {
        super(name);  // Используем конструктор родителя
        this.age = age;
    }

    // Реализация абстрактного метода: собака выполняет действие
    @Override
    public void performAction() {
        System.out.println("Собака лает!");
    }

    // Переопределение неабстрактного метода: отображение собаки
    @Override
    public void display() {
        super.display();  // Вызов метода родителя
        System.out.println("Возраст: " + age);  // Дополнительная информация
    }
}