package ru.oshkina.demo10;

import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals); //это работает

        ArrayList<Dog> dogs = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());

        takeAnimals(dogs);

       // takeAnimals2(dogs);
        takeAnimals2(animals);
    }

    public <T extends Animal> void takeAnimals(ArrayList<T> animals) {
        for (Animal a : animals) {
            a.eat();
        }
        //animals.add(new Cat());
    }

    public void takeAnimals2(ArrayList<? super Animal> animals) {
        animals.add(new Cat());
        // animals.add(new Cat());
    }
}
