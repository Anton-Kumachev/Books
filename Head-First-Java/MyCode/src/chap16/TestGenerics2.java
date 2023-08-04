package chap16;

import java.util.ArrayList;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    public void go() {
        ArrayList<Animal2> animals2 = new ArrayList<>();
        animals2.add(new Dog2());
        animals2.add(new Cat2());
        animals2.add(new Dog2());

        takeAnimals2(animals2);
    }

    public void takeAnimals2(ArrayList<Animal2> animals2) {
        for(Animal2 a: animals2) {
            a.eat();
        }
    }
}

abstract class Animal2 {
    void eat() {
        System.out.println("Животное ест");
    }
}

class Dog2 extends Animal2 {
    void bark() { }
}
class Cat2 extends Animal2 {
    void meow() { }
}