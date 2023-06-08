package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        // dichiaro un array di oggetti "Animal" chiamato "farm" con 4 elementi.
        Animal[] farm = new Animal[4];
        // assegno ad ogni elemento una posizione nell'array
        farm[0] = new Dog();
        farm[1] = new Dolphin();
        farm[2] = new Sparrow();
        farm[3] = new Eagle();

        // per ogni animal in farm...
        for (Animal animal : farm) {
            System.out.println("-- Esercizio 1 --");
            // ...stampo il nome della classe dell'animale utilizzando il metodo "getClass().getSimpleName()"
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            // richiamo i metodi generici di Animal
            animal.callSound();
            animal.eat();
            animal.sleep();
            // Se animal è un'istanza di un oggetto che implementa l'interfaccia "CanFly",
            // chiamo il metodo "makeFly" passando animal come parametro.
            if (animal instanceof CanFly) {
                System.out.println("-- Esercizio 2 --");
                System.out.print("Flies: ");
                makeFly((CanFly) animal);
            }
            //Se animal è un'istanza di un oggetto che implementa l'interfaccia "CanSwim",
            // chiamo il metodo "makeSwim" passando l'animale come parametro.
            if (animal instanceof CanSwim) {
                System.out.println("-- Esercizio 2 --");
                System.out.print("Swims: ");
                makeSwim((CanSwim) animal);
            }
        }

    }
    //METHODS
    // passo il parametro animal e richiamo i metodi delle interfacce
    public static void makeFly(CanFly animal) {
        // invoco il metodo "fly()" dell' interfaccia CanFly sull'oggetto animal
        animal.fly();
    }
    public static void makeSwim(CanSwim animal) {
        // invoco il metodo "swim()" dell' interfaccia CanSwim sull'oggetto animal
        animal.swim();
    }
}
