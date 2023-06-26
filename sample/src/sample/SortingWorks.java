package sample;

import java.util.Arrays;

public class SortingWorks {
	public static void main(String[] args) {
		int[] arr= {5,-20,98,56,76,-45,34,-98,3,17};
//		BubbleSort(arr);
//		InsertionSort(arr);
//		SelectionSort(arr);
		arr=MergeSort(arr);
//		QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	static void QuickSort(int[] arr,int low,int hi) {
		if(low>=hi) {
			return;
		}
		int s=low;
		int e=hi;
		int m=s+(e-s)/2;
		int pivot=arr[m];
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		QuickSort(arr, low, e);
		QuickSort(arr, s, hi);
	}
	static int[] MergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int m=arr.length/2;
		int[] left=MergeSort(Arrays.copyOfRange(arr, 0, m));
		int[] right=MergeSort(Arrays.copyOfRange(arr, m, arr.length));
		
		return merge(left,right);
	}
	private static int[] merge(int[] f, int[] s) {
		int[] mix=new int[f.length+s.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<f.length&&j<s.length) {
			if(f[i]<s[j]) {
				mix[k]=f[i];
				i++;
			}else {
				mix[k]=s[j];
				j++;
			}
			k++;
		}
		while(i<f.length) {
			mix[k]=f[i];
			i++;
			k++;
		}
		while(j<s.length) {
			mix[k]=s[j];
			j++;
			k++;
		}
		return mix;
	}
	

}
