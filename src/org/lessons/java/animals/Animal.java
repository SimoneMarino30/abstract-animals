package org.lessons.java.animals;

public abstract class Animal {
    public abstract void callSound();
    public abstract void eat();
    public void sleep() {
        System.out.println("Goodnight animal: ZZZZZZZ");
        System.out.println("------------------------------------");
    }

}
