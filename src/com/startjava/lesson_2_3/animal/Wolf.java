package com.startjava.lesson_2_3.animal;

public class Wolf {
    private char gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    // public copyWolf

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void howl() {
        System.out.println("воет");
    }

    public void hunt() {
        System.out.println("охотится");
    }
}