package Interview;

import java.util.HashMap;
import java.util.Map;

public class Count {

    public static void main(String[] args) {

        String[] arr = {"Java", "Testing", "Java", "Testing", "Test", "Java"};

        Map<String, Integer> count = new HashMap<>();

        for (String word : arr) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count);
    }
}