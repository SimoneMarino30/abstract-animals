package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[4];
        farm[0] = new Dog();
        farm[1] = new Dolphin();
        farm[2] = new Sparrow();
        farm[3] = new Eagle();

        for (Animal animal : farm) {
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            animal.callSound();
            animal.eat();
            animal.sleep();
            if (animal instanceof CanFly) {
                System.out.print("Flies: ");
                makeFly((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                System.out.print("Swims: ");
                makeSwim((CanSwim) animal);
            }
        }

    }
    //METHODS
    public static void makeFly(CanFly animal) {
        animal.fly();
    }
    public static void makeSwim(CanSwim animal) {
        animal.swim();
    }
}
