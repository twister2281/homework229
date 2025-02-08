package Task4;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры животных
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        // Создаем зоопарк
        Zoo zoo = new Zoo();

        // Добавляем животных в зоопарк
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        // Все животные издают звуки
        zoo.makeAllSounds();

        // Все животные получают корм
        zoo.feedAll("мясо");

        // Дополнительные действия
        if (lion instanceof Lion) {
            ((Lion) lion).hunt();  // Лев идет на охоту
        }
        if (elephant instanceof Elephant) {
            ((Elephant) elephant).playWater();  // Слон играет с водой
        }
        if (monkey instanceof Monkey) {
            ((Monkey) monkey).swing();  // Обезьяна качается на ветке
        }
    }
}
