package sortingWorkOuts;

import java.util.Arrays;

public class SelactionSort {
	public static void main(String[] args) {
		int[] arr= {3,-23,99,-38,2,4,6,5,1};
		System.out.println(Arrays.toString(arr));
		selactionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void selactionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int end=arr.length-i-1;
			int maxindex=SearchMax(arr,0,end);
			swap(arr,maxindex,end);
		}		
	}
	static int SearchMax(int[] arr,int start,int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
		if(arr[max]<arr[i]) {
			max=i;			
		}
		}
		return max;		
	}
	static void swap(int[] arr,int start,int max) {
		int temp=arr[start];
		arr[start]=arr[max];
		arr[max]=temp;
	}

}
