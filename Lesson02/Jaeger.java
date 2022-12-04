import java.util.Random;

public class Jaeger {
    private String name;
    private String origin;
    private float height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String name, String origin, float height, double weight,
            int speed, int strength, int armor) {
        this.name = name;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void battle(Jaeger obj) {
        Jaeger randomObj1;
        Jaeger randomObj2;
        if (random()) {
            randomObj1 = this;
            randomObj2 = obj;
        } else {
            randomObj1 = obj;
            randomObj2 = this;
        }
        move(randomObj1.getName(), randomObj2.getName());
        attack(randomObj1.getName(), randomObj2.getName());
    }

    public void move() {
        System.out.println(this.name + " is moving.");
    }

    public void move(String name1, String name2) {
        System.out.println(name1 + " is moving to " + name2);
    }

    public void attack() {
        System.out.println(this.name + " is attacking!");
    }

    private void attack(String name1, String name2) {
        String randomName1;
        String randomName2;
        if (random()) {
            randomName1 = name1;
            randomName2 = name2;
        } else {
            randomName1 = name2;
            randomName2 = name1;
        }
        System.out.print(randomName1 + " is attacking " + randomName2 + "\nAfter that ");
        if (random()) {
            if (random()) {
                runAway(randomName1);
            } else {
                runAway(randomName2);
            }
        } else {
            fight(randomName1, randomName2);
            if (random()) {
                destroy(randomName1);
            } else {
                destroy(randomName2);
            }
        }
    }

    public void runAway() {
        System.out.println(this.name + " is running away!");
    }

    private void runAway(String name) {
        System.out.println(name + " is running away!");
    }

    public void fight() {
        System.out.println(name + " is fighting.");
    }

    private void fight(String name1, String name2) {
        System.out.println(name1 + " and " + name2 + " are fighting!");
    }

    public void destroy() {
        System.out.println(this.name + " is destroyed.");
    }

    private void destroy(String name) {
        System.out.println(name + " is destroyed.");
    }

    private boolean random() {
        Random random = new Random();
        return random.nextBoolean();
    } 

    @Override
    public String toString() {
        return ("Name: " + name + "\nOrigin: " + origin + "\nHeight: " + height + " m" + 
                "\nWeight: " + weight + " tons" + "\nSpeed: " + speed + 
                "\nStrength: " + strength + "\n" );
    }
}