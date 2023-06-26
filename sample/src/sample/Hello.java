package sample;

public class Hello {
	public static void main(String[] args) {
//		System.out.println(fibo(13));
		System.out.println(facotial(5));
		
	}
//	static int fibo(int n) {
//		if(n<2) {
//			return n;
//		}
//		return fibo(n-2)+fibo(n-1);
//	}
	static int facotial(int n) {
		if(n==0) {
			return 1;
		}
		return n*facotial(n-1);
	}

}
