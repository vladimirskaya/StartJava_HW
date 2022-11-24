public class Person {
    char sex = 'm';
    String name = "Петя Иванов";
    float height = 1.78f;
    float weight = 70.8f;
    byte age = 25;

    void go() {
        System.out.println( name + " идет.");
    }

    void sit() {
        System.out.println( name + " сидит.");
    }

    void run() {
        System.out.println( name + " бежит.");
    }

    void say() {
        System.out.println( name + " говорит.");
    }

    void learnJava() {
        System.out.println( name + " учит Java.");
    }
}