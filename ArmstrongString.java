package Interview;

public class ArmstrongString {
public static void main(String[] args) {
	String str = "153";
	int num = Integer.parseInt(str);
	int originalNum, remainder, result = 0;

	originalNum = num;

	while (originalNum != 0) {
		remainder = originalNum % 10;
		result += Math.pow(remainder, 3);
		originalNum /= 10;
	}

	if (result == num)
		System.out.println(num + " is an Armstrong number.");
	else
		System.out.println(num + " is not an Armstrong number.");
}
}