package sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problems {
//	Queue<Integer> myQ=new LinkedList<>();
//	
//	public void push(int x) {
//		myQ.add(x);
//		for(int i=1;i<myQ.size();i++) {
//			myQ.add(myQ.remove());
//		}
//	}
//	public int pop() {
//		return myQ.remove();
//	}
//	public int top() {
//		return myQ.peek();
//	}
//	public boolean emty() {
//		return myQ.isEmpty();
//	}
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	public void push(int x) {
		s1.push(x);
	}
	public int pop() {
		if(!s2.empty()) {
			return s2.pop();
		}else {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public int peek() {
		if(!s2.empty()) {
			return s2.peek();
		}else {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}
	public boolean emty() {
		return s1.empty();
	}
	static String reverse(String str) {
		Stack<Character> stak=new Stack<>();
		char[] rev=str.toCharArray();
		for(char c:rev) {
			stak.add(c);
		}
		for(int i=0;i<rev.length;i++) {
			rev[i]=stak.pop();
		}
		
		return new String(rev);
	}
	
	public static void main(String[] args) {
		Problems s=new Problems();
		String name="irshad";
		System.out.println(name);
		System.out.println(reverse(name));
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		System.out.println(s.pop());
//		System.out.println(s.top());
	}

}
