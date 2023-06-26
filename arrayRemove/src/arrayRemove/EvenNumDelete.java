package arrayRemove;

public class EvenNumDelete {
	public void DisplayArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int[] removeEven(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		int[] result=new int[count];
		int d=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[d]=arr[i];
				d++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		EvenNumDelete s=new EvenNumDelete();
		int[] arr={2,5,6,3,8,4,7};
		s.DisplayArray(arr);
		int[] result=s.removeEven(arr);
		s.DisplayArray(result);
	}
}
