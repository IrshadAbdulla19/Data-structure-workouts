package binarySearch;

public class FindTargetArrayLinear {
	public static int SearchKey1(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
		if(target==arr[i]) {
			return i;
		}
		
		}
		return -1;
	}
	public static int SearchKey2(int[] arr,int target) {
		if(arr.length==0) {
			return Integer.MAX_VALUE;
		}
			for(int elements:arr) {
		if(elements==target) {
			return elements;
		}
		
		}
		return Integer.MAX_VALUE;
	}
	public static boolean SearchKey3(int[] arr,int target) {
		if(arr.length==0) {
			return false;
		}
			for(int elements:arr) {
		if(elements==target) {
			return true;
		}
		
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		System.out.println(SearchKey1(arr, 4));
		System.out.println(SearchKey2(arr, 5));
		System.out.println(SearchKey3(arr, 8));
	}

}
