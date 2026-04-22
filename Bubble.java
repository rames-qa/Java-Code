package Interview;

public class Bubble {
	public static void main(String[] args) {
		int[]arr = {3,4,2,5,6,7};
	for(int i=1;i<arr.length-1; i++) {
   for(int j=1;j<arr.length-1-i; j++) {
	   if(arr[j]>arr[j+1]) {
		   int temp=arr[j];
		   arr[j]=arr[j+1];
		   arr[j+1]=temp;
		   
	   }
   }
}
for (int num:arr) {
	System.out.println(num+   "");
}
	}
	}
	