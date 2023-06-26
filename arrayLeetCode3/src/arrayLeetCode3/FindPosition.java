package arrayLeetCode3;

public class FindPosition {
	public static void main(String[] args) {
		MultiTable(1);
	}
	static int MultiTable(int n) {
			if(n==10) {
				System.out.println("2x"+n+"="+2*n);
				return 2*n;
			}
			System.out.println("2x"+n+"="+2*n);
			
			return MultiTable(n+1);
	}

}
