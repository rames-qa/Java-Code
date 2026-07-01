package Interview;

public class lettersdigitsandspecialcharacters {

	    public static void main(String[] args) {

	        String input = "a1$b2+c@3l:d#";

	        StringBuilder letters = new StringBuilder();
	        StringBuilder digits = new StringBuilder();
	        StringBuilder special = new StringBuilder();

	        for (char ch : input.toCharArray()) {

	            if (Character.isLetter(ch))
	                letters.append(ch);
	            else if (Character.isDigit(ch))
	                digits.append(ch);
	            else
	                special.append(ch);
	        }

	        System.out.println("Letters : " + letters);
	        System.out.println("Digits  : " + digits);
	        System.out.println("Special : " + special);
	    }
	}

