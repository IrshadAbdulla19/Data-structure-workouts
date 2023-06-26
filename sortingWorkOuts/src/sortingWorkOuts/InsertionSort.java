package sortingWorkOuts;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {4,7,6,3,5,-2,99,-34};
		System.out.println(Arrays.toString(arr));
		insetionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void insetionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					Swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}
	static void Swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
