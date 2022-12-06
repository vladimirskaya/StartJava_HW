public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Tacit Ronin");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(74.37f);
        jaeger1.setWeight(7.450);
        jaeger1.setSpeed(8);
        jaeger1.setStrength(7);
        jaeger1.setArmor(3);

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Russia", 85.34f, 2.412, 3, 10, 10);

        System.out.println("\n" + jaeger1);
        System.out.println(jaeger2);
        jaeger1.battle(jaeger2);

        jaeger1.setName("Black Mamba");
        jaeger1.setOrigin("India");
        System.out.println("\n" + jaeger1);
        jaeger1.move();
        jaeger1.fight();
        System.out.println("\nNew robot's generation: " + jaeger2.getName());
        jaeger2.setName("Anatoliy 2053");
        jaeger2.setSpeed(53);
        jaeger2.setArmor(100);
        System.out.println(jaeger2);
        jaeger2.battle(jaeger1);
    }
}