package Interview;

public class sumOfInteger {
	    public static void main(String[] args) {
	        String a[] = {"7sad9", "hgds99", "hfd78"};

	        int sum = 0;

	        for (String str : a) {
	            String num = str.replaceAll("\\D", ""); // Remove non-digits
	            sum += Integer.parseInt(num);
	        }

	        System.out.println(sum);
	    }
	}
