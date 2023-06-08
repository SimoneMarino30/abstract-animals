package org.lessons.java.animals;

public abstract class Animal {
    // metodi astratti implementati nelle singole classi che estendono Animal
    public abstract void callSound();
    public abstract void eat();
    // metodo implementato nella classe astratta Animal
    public void sleep() {
        System.out.println("Goodnight: ZZZZZZZ");
    }

}
