package org.lessons.java.animals;

public class Eagle extends Animal implements CanFly {
    @Override
    public void callSound() {
        System.out.println("Call sound: skreeee");
    }
    @Override
    public void eat() {
        System.out.println("Food: mice");
    }

    @Override
    public void fly() {
        System.out.println("I'm flyiiiiiing!!!");
        System.out.println("-----------------------");
    }
}
