package org.lessons.java.animals;

public class Dog extends Animal implements CanSwim {
    // metodi derivati da Animal
    @Override
    public void callSound() {
        System.out.println("Call sound: woof-woof");
    }

    @Override
    public void eat() {
        System.out.println("Food: meat");
    }
    // metodo da CanSwim
    @Override
    public void swim() {
        System.out.println("I'm swimming!!!");
        System.out.println("-----------------------");
    }
}
