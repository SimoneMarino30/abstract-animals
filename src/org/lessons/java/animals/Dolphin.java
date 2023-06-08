package org.lessons.java.animals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void callSound() {
        System.out.println("Call sound: eee-eee");
    }

    @Override
    public void eat() {
        System.out.println("Food: plankton");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!!!");
        System.out.println("-----------------------");
    }
}
