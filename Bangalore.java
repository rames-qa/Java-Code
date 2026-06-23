package Interview;
// Abstract class
abstract class City {
    // Abstract method
    abstract void famousPlace();
    // Normal method
    void state() {
        System.out.println("City is in Karnataka");
    }
}
// Child class
public class Bangalore extends City {
    void famousPlace() {
        System.out.println("Bangalore famous place is Lalbagh");
    }
    public static void main(String[] args) {
        City b = new Bangalore(); // Abstraction
        b.famousPlace();
        b.state();
    }
}