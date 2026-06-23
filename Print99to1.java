package Interview;

public class Print99to1 {
	public static void printNumbers(int n) {
		if (n < 1) {
			return;
		}
		System.out.println(n);
		printNumbers(n - 1);
	}
public static void main(String[] args) {
	printNumbers(99);
}
}