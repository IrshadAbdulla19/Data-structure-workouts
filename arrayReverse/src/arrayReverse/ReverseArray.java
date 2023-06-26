package arrayReverse;

public class ReverseArray {
	public void revrseArray(int[] num,int start,int end) {
		while(start<end) {
			int temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
	}
	public void DisplayArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ReverseArray s=new ReverseArray();
		int[] num= {1,2,3,4,5,6,7,8};
		s.DisplayArray(num);
		s.revrseArray(num, 0, num.length-1);
		s.DisplayArray(num);		
	}
}
