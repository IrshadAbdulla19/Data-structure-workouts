package binarySearch;

public class BinarySearchDecending {
	public static void main(String[] args) {
		int[] arr= {98,76,43,32,23,12,5,-12,-34,-67,-90};
		System.out.println(BinarySearch(arr, 23));
	}
	static int BinarySearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		 while(start<=end) {
			 int mid=(start+end)/2; 
			 
			 if(arr[mid]==target) {
				 return mid;
			 }else if(target<arr[mid]){
				 start=mid+1;
			 }else {
				 end=mid-1;
			 }
		 }
		 return -1;
	}

}
