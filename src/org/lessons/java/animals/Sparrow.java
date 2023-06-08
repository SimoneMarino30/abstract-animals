package org.lessons.java.animals;

public class Sparrow extends Animal {
    @Override
    public void callSound() {
        System.out.println("The sparrow's call sound is cip-cip");
    }
    @Override
    public void eat() {
        System.out.println("The sparrow eats insects");
    }
}
