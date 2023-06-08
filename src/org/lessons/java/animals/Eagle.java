package org.lessons.java.animals;

public class Eagle extends Animal {
    @Override
    public void callSound() {
        System.out.println("The eagle's call sound is skreeee");
    }
    @Override
    public void eat() {
        System.out.println("The eagle eats mice");
    }
}
