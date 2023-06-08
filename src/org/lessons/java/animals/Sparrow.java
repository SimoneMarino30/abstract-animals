package org.lessons.java.animals;

public class Sparrow extends Animal implements CanFly {
    // metodi derivati da Animal
    @Override
    public void callSound() {
        System.out.println("Call sound: cip-cip");
    }
    @Override
    public void eat() {
        System.out.println("Food: insects");
    }
    // metodo da CanFly
    @Override
    public void fly() {
        System.out.println("I'm flyiiiiiing!!!");
        System.out.println("-----------------------");
    }
}
