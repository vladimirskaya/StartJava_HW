public class WolfTest {

    public static void main(String[] args) {
        Wolf newWolf = new Wolf();
        newWolf.setGender('м');
        newWolf.setName("Уолкер");
        newWolf.setWeight(5f);
        newWolf.setAge(6);
        newWolf.setColor("черный");

        System.out.println("Пол волка: " + newWolf.getGender());
        System.out.println("Кличка волка: " + newWolf.getName());
        System.out.println("Вес волка: " + newWolf.getWeight());
        System.out.println("Возраст волка: " + newWolf.getAge() + " лет");
        System.out.println("Окрас волка: " + newWolf.getColor());

        newWolf.go();
        newWolf.sit();
        newWolf.run();
        newWolf.howl();
        newWolf.hunt();
    }
}