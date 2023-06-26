package binarySearch;

public class SearchInRangeLinear {
	public static boolean searchInRange(int[] arr,int target,int start,int end) {
		if(arr.length==0) {
			return false;
		}
		for(int i=start;i<end;i++) {
			if(target==arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(searchInRange(arr, 4, 1, 2));
	}

}
