package binarySearch;

public class FindTargetBinery {
	public static boolean findTargetBinary(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return true;
			}else if(target<arr[mid]){
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {-67,-45,-12,1,3,5,7,12,15,23,67}; 
		System.out.println(findTargetBinary(arr, -12));
	}

}
