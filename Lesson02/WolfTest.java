public class WolfTest {

    public static void main(String[] arg) {
        Wolf newWolf = new Wolf();
        newWolf.gender = 'м';
        newWolf.name = "Уолкер";
        newWolf.weight = 5f;
        newWolf.age = 6;
        newWolf.color = "черный";

        System.out.println("Пол волка: " + newWolf.gender);
        System.out.println("Кличка волка: " + newWolf.name);
        System.out.println("Вес волка: " + newWolf.weight);
        System.out.println("Возраст волка: " + newWolf.age + " лет");
        System.out.println("Окрас волка: " + newWolf.color);

        newWolf.go();
        newWolf.sit();
        newWolf.run();
        newWolf.howl();
        newWolf.hunt();
    }
}