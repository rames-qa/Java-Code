package Interview;

public class SlidingWindowVariable {
	    public static int smallestSubarrayWithGivenSum(int target, int[] arr) {
	        int windowSum = 0;
	        int minLength = Integer.MAX_VALUE;
	        int start = 0;

	        // 'end' pointer expands the window
	        for (int end = 0; end < arr.length; end++) {
	            windowSum += arr[end];

	            // Shrink the window from the left as long as the condition is met
	            while (windowSum >= target) {
	                minLength = Math.min(minLength, end - start + 1);
	                windowSum -= arr[start];
	                start++; // Move the left pointer forward
	            }
	        }
	        return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }
	    public static void main(String[] args) {
	        int[] nums = {2, 1, 5, 2, 3, 2};
	        int target = 7;
	        System.out.println("Smallest subarray length: " + smallestSubarrayWithGivenSum(target, nums));
	        // Output: 2 (from the window [5, 2])
	    }
	}
