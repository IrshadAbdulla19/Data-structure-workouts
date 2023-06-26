package arrayFindMin;

public class FindMinimum {
	public int FindMin(int[] arr) {
		if(arr==null||arr.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {15,9,3,5,18,19};
		FindMinimum mi=new FindMinimum();
		System.out.println(mi.FindMin(arr));
	}

}
