package sample;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner ins=new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int b= ins.nextInt();
		
		System.out.println("Decimal number is:"+findDecimal(b));
	}
	static int findDecimal(int b) {
		int d=0;
		int t=b;
		int i=0;
		while(t>0) {
			int r=t%10;
			t=t/10;
			d=d+r*(int)Math.pow(2, i++);
		}
		
		return d;
	}

}
