package Interview;

public class FindIPhoneVariantsWithoutRegex {

    public static void main(String[] args) {

        String input = "IPhone11AirpodIPhone12MacbookIPhone13Ipad";

        int count = 0;

        for (int i = 0; i < input.length() - 5; i++) {

            if (input.substring(i).startsWith("IPhone")) {

                count++;

                String variant = "IPhone";
                i += 6;

                while (i < input.length() &&
                       Character.isDigit(input.charAt(i))) {
                    variant += input.charAt(i);
                    i++;
                }

                System.out.println(variant);
            }
        }

        System.out.println("Count = " + count);
    }
}
