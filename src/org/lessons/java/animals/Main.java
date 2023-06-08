package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[4];
        farm[0] = new Dog();
        farm[1] = new Dolphin();
        farm[2] = new Sparrow();
        farm[3] = new Eagle();

        for (Animal a : farm) {
            a.callSound();
            a.eat();
            a.sleep();
        }
    }
}
