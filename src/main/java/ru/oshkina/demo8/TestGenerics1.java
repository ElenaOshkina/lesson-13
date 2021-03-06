package ru.oshkina.demo8;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        //takeAnimals(animals);
        takeAnimals(dogs);
    }

    /**
     * Метод может принимать как Animal[] так и Dog[],
     * так как Dog является Animal - полиморфизм в действии
     */
    public void takeAnimals(Animal[] animals) { //Это ключевой момент,
        for (Animal a : animals) {
            a.eat(); //можем вызвать методы, только из Animal
        }
        animals[0] = new Cat();
    }
}
