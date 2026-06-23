package Interview;

public class StringCompression {
public static void main(String[] args) {
	String str = "aaabbccdd";
	StringBuilder compressed = new StringBuilder();
	int count = 1;

	for (int i = 0; i < str.length(); i++) {
		if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
			count++;
		} else {
			compressed.append(str.charAt(i));
			compressed.append(count);
			count = 1;
		}
	}

	System.out.println("Original string: " + str);
	System.out.println("Compressed string: " + compressed.toString());
}
}
