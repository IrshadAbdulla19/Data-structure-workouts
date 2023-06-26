package sortingWork1;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {5,-1,6,2,90,-40,-6,12,65};
//		bubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
//		insertionSort(arr);
//		System.out.println(Arrays.toString(arr));
//		selectionSort(arr);
//		System.out.println(Arrays.toString(arr));
//		arr=mergeSort(arr);
//		System.out.println(Arrays.toString(arr));
		quikSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return;
	}
	static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					break;
				}
			}
		}
	}
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int e=arr.length-i-1;
			int maxIdx=findMaxIdx(arr,0,e);
			swap(arr,maxIdx,e);
			
		}
	}
	private static void swap(int[] arr, int max, int e) {
		int temp=arr[max];
		arr[max]=arr[e];
		arr[e]=temp;
		
	}
	private static int findMaxIdx(int[] arr, int s, int e) {
		int max=s;
		for(int i=0;i<=e;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
	static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return mereg(left,right);
	}
	private static int[] mereg(int[] first, int[] second) {
		int[] mix=new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length&&j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
	}
	static void quikSort(int[] arr,int low,int hi) {
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
		quikSort(arr, low, e);
		quikSort(arr, s, hi);
	}
	

}
