package Interview;
public class Sel1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Swapping logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}