package Interview;

public class LettersSpecialcharacters {

	    public static void main(String[] args) {

	        String input = "a$b+c@l:d#";

	        String letters = input.replaceAll("[^A-Za-z]", "");
	        String special = input.replaceAll("[A-Za-z]", "");

	        System.out.println("Letters : " + letters);
	        System.out.println("Special : " + special);
	    }
	}