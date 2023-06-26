package recursion1;

public class FactorialRecurtion {
	public static void main(String[] args) {
		System.out.println(FactorialRecurstion(5));
	}
	static int FactorialRecurstion(int n) {
		if(n==0) {
			return 1;
		}
		return n*FactorialRecurstion(n-1);
	}

}
