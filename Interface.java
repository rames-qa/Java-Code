package Interview;
// Interface
interface Animal2 {
    void sound();   // Abstract method
}
// Implementing class
public class Interface implements Animal2 {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Animal2 a = new Interface();

        a.sound();
    }
}