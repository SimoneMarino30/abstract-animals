package org.lessons.java.animals;

public class Dolphin extends Animal {
    @Override
    public void callSound() {
        System.out.println("The dolphin's call sound is eee-eee");
    }

    @Override
    public void eat() {
        System.out.println("The dolphin eats plankton");
    }
}
