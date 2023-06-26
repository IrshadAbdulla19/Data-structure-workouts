package sample;

public class RcertionSamble {
	public static void main(String[] args) {
		function(4);
	}
	
	static void function(int n) {
		if(n<=1) {
			return;
		}
		function(n-1);
		System.out.println(n);
//		function(n-1);
	}

}
