/*
Question:
How can you create Animal(name, makeSound(), eat()), Dog, Cat, GoldenRetriever, and show runtime polymorphism using Animal[]?
*/
class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " barks");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " meows");
    }

    void purr() {
        System.out.println(name + " is purring");
    }
}

class GoldenRetriever extends Dog {
    GoldenRetriever(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " gives a friendly bark");
    }
}

class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex"),
                new Cat("Whiskers"),
                new GoldenRetriever("Buddy")
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }

        Dog dog = new Dog("Rocky");
        dog.fetch();

        Cat cat = new Cat("Kitty");
        cat.purr();
    }
}
