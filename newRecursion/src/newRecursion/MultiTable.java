package newRecursion;

public class MultiTable {
	public static void main(String[] args) {
		int n=1;
		int i=4;
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"x"+n+"="+n*i);
//		}
		multitable(n,i);
	}
	static int multitable(int n,int i) {
		if(n==50) {
			System.out.println(n+"x"+i+"="+n*i);
			return 0;
		}
		System.out.println(n+"x"+i+"="+n*i);
		return multitable(n+1,i);
	}

}
