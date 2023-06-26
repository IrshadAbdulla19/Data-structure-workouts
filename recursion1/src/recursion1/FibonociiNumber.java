package recursion1;

public class FibonociiNumber {
	public static void main(String[] args) {
		int ans=FindNthFibo(7);
		System.out.println(ans);
	}
	static int FindNthFibo(int n) {
		if(n<2) {
			return n;
		}
		return FindNthFibo(n-1)+FindNthFibo(n-2);
	}
}
