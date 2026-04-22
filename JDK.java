package Interview;

public class JDK {
    public static void main(String[] args) {

        int a = 12;
        int b = 23;

        System.out.println("Before swap");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}