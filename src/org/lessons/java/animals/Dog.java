package org.lessons.java.animals;

public class Dog extends Animal {

    @Override
    public void callSound() {
        System.out.println("The dog's call sound is wof-wof");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats meat");
    }
}
