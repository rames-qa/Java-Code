package Interview;

import java.util.Scanner;

public class Countvowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string= ");
        String input = sc.nextLine();

        long count = countVowelsWithStreams(input);

        System.out.println("Number of vowels: " + count);

        sc.close();
    }

    public static long countVowelsWithStreams(String str) {
        return str.toLowerCase()
                .chars()
                .filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                .count();
    }
}