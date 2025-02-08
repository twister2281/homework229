package Task1;

class Cat extends Entity {  // Класс для кошки
    String breed;  // Атрибут: порода кошки

    // Конструктор кошки: имя, идентификатор, порода
    public Cat(String name, int id, String breed) {
        super(name, id);  // Используем конструктор родителя
        this.breed = breed;
    }

    // Конструктор кошки: имя и порода (идентификатор по умолчанию - 0)
    public Cat(String name, String breed) {
        super(name);  // Используем конструктор родителя
        this.breed = breed;
    }

    // Реализация абстрактного метода: кошка выполняет действие
    @Override
    public void performAction() {
        System.out.println("Кошка мяукает!");
    }

    // Переопределение неабстрактного метода: отображение кошки
    @Override
    public void display() {
        super.display();  // Вызов метода родителя
        System.out.println("Порода: " + breed);  // Дополнительная информация
    }
}