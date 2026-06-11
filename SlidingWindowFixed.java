package Interview;

	public class SlidingWindowFixed {
	    public static int maxSumSubarray(int[] arr, int k) {
	        if (arr == null || arr.length < k) {
	            return 0;
	        }

	        int windowSum = 0;
	        // Calculate the sum of the first window
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        int maxSum = windowSum;

	        // Slide the window across the array
	        for (int i = k; i < arr.length; i++) {
	            // Add the next element, subtract the element that fell out of the window
	            windowSum += arr[i] - arr[i - k];
	            maxSum = Math.max(maxSum, windowSum);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 1, 5, 1, 3, 2};
	        int k = 3;
	        System.out.println("Max sum of subarray of size " + k + ": " + maxSumSubarray(nums, k)); 
	        // Output: 9 (from the window [5, 1, 3])
	    }
	}
