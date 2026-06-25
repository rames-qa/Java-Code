package Interview;


	import java.util.regex.*;
	import java.util.*;

	public class FindIPhoneVariants {

	    public static void main(String[] args) {

	        String input = "IPhone11AirpodIPhone12MacbookIPhone13Ipad";

	        Pattern pattern = Pattern.compile("IPhone\\d+");
	        Matcher matcher = pattern.matcher(input);

	        List<String> variants = new ArrayList<>();

	        while (matcher.find()) {
	            variants.add(matcher.group());
	        }

	        System.out.println("Count: " + variants.size());
	        System.out.println("Variants: " + variants);
	    }
	}
