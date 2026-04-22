package Interview;

public class ResverseString {
	    public static void main(String[] args) {
	        String original = "Hello";
	        StringBuilder reversed = new StringBuilder(original);	        
	        reversed.reverse();	        
	        String reversedString = reversed.toString();	        
	        System.out.println("Original string: " + original);
	        System.out.println("Reversed string: " + reversedString);
	    }
	}

