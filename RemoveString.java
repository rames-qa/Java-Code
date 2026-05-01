package Interview;

	import java.util.LinkedHashSet;

	public class RemoveString {
		    public static void main(String[] args) {
		        String str = "Java is easy Java is and  more powerful";

		        String[] words = str.split(" ");

		        LinkedHashSet<String> set = new LinkedHashSet<>();

		        for (String word : words) {
		            set.add(word);
		        }

		        for (String word : set) {
		            System.out.print(word + " ");
		        }
		    }
		}
	

