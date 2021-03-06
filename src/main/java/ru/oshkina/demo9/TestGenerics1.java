package ru.oshkina.demo9;

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
       // takeAnimals(animals); //это работает

        ArrayList<Dog> dogs = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());

       // takeAnimals(dogs);

        ArrayList<Dog> dogs1 = new ArrayList<Dog>();
    }

    public void takeAnimals(ArrayList<Animal> animals) {

    }

    public void takePet(ArrayList<? extends Pet> animals) {

    }
}
