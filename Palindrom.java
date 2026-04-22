package Interview;

public class Palindrom {   // You can rename to Palindrome (optional)
    public static void main(String[] args) {
        String str = "Guhana";

        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }
}