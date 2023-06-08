package org.lessons.java.animals;

public class Eagle extends Animal implements CanFly {
    // metodi derivati da Animal
    @Override
    public void callSound() {
        System.out.println("Call sound: skreeee");
    }
    @Override
    public void eat() {
        System.out.println("Food: mice");
    }
    // metodo da CanFly
    @Override
    public void fly() {
        System.out.println("I'm flyiiiiiing!!!");
        System.out.println("-----------------------");
    }
}
