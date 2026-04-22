package Interview;
// Compile-Time Polymorphism (Method Overloading)
class Animal1 {

    void sound() {
        System.out.println("Animal makes sound");
    }

    void sound(String name) {
        System.out.println(name + " makes sound");
    }

    void sound(String name, int times) {
        System.out.println(name + " makes sound " + times + " times");
    }
}

public class Poly25 {

    public static void main(String[] args) {

        Animal1 a = new Animal1();

        a.sound();
        a.sound("Dog");
        a.sound("Dog", 4);
    }
}