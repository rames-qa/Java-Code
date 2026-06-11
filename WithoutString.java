package Interview;

public class WithoutString {
	    public static void main(String[] args) {

	        char[] arr = {'O', 'L', 'L', 'E', 'H'};

	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
	            char temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	        System.out.print("Reversed Characters: ");

	        for (char ch : arr) {
	            System.out.print(ch);
	        }
	    }
	}