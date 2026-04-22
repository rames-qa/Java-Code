package Interview;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Input String=" + str);
        System.out.println("Duplicate characters=");
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // Print only first occurrence of duplicate
            if (isDuplicate && str.indexOf(str.charAt(i)) == i) {
                System.out.println(str.charAt(i));
            }
        }
    }
}