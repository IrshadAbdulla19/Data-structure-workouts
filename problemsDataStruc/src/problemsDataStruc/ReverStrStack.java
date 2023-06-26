package problemsDataStruc;

import java.util.Stack;

public class ReverStrStack {
	public static void main(String[] args) {
		String name="irshad";
		System.out.println(name);
		System.out.println(Reverse(name));
	}
	static String Reverse(String str) {
		Stack<Character> stck=new Stack<>();
		char[] rev=str.toCharArray();
		for(char c:rev) {
			stck.push(c);
		}
		for(int i=0;i<rev.length;i++) {
			rev[i]=stck.pop();
		}
		return new String(rev);
	}

}
