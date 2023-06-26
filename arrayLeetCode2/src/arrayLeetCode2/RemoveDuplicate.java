package arrayLeetCode2;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr= {0,1,1,2,2,2,3,4};
		RemoveDuplicate s=new RemoveDuplicate();
//		int[] result=s.Remove(arr);
		s.Remove(arr);
		s.display(arr);
		int k=s.Remove(arr);
		System.out.println(k);
	}
	public int Remove(int[] arr) {
		int p=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[p]!=arr[i]) {
				arr[p+1]=arr[i];
				p++;
			}
	
		}
		return p-2;
	}
	public void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
