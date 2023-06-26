package sortingWorkOuts;

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] arr= {2,4,3,1,7,5,9};
		BubbleSorting s=new BubbleSorting();
		System.out.println(Arrays.toString(arr));
		s.Bubble(arr);
		System.out.println(Arrays.toString(arr));
				
		
	}
	public void Bubble(int[] arr) {
		int count;
		for(int i=0;i<=arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count=1;						
				}				
			}
			if(count==0) {
				break;
			}
		}		
}
}

