package Interview;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Number to calculate factorial
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}