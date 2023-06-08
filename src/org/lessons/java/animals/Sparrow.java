package org.lessons.java.animals;

public class Sparrow extends Animal implements CanFly {
    @Override
    public void callSound() {
        System.out.println("Call sound: cip-cip");
    }
    @Override
    public void eat() {
        System.out.println("Food: insects");
    }

    @Override
    public void fly() {
        System.out.println("I'm flyiiiiiing!!!");
        System.out.println("-----------------------");
    }
}
