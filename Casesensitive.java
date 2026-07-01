package Interview;

public class Casesensitive {

	    public static void main(String[] args) {

	        String input = "my name is ramesh kumar";
	        String[] words = input.split(" ");

	        StringBuilder result = new StringBuilder();

	        for (String word : words) {

	            if (word.length() >= 2) {
	                result.append(word.charAt(0)); // First letter

	                result.append(Character.toUpperCase(word.charAt(1))); // Second letter

	                if (word.length() > 2) {
	                    result.append(word.substring(2)); // Remaining letters
	                }
	            } else {
	                result.append(word); // Single-letter word
	            }

	            result.append(" ");
	        }

	        System.out.println(result.toString().trim());
	    }
	}

