package Interview;

// Runtime Polymorphism (Method Overriding)

// Parent class
class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barking");
    }
}

// Main class
public class Poly26 {

    public static void main(String[] args) {

        Animal animal = new Dog();   // Runtime Polymorphism
        animal.sound();
    }
}