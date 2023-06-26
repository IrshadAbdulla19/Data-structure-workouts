package sample;

import java.util.Stack;

public class StackUsingQueue {
	    private Stack<Integer> inStack;
	    private Stack<Integer> outStack;

	    public StackUsingQueue() {
	        inStack = new Stack<>();
	        outStack = new Stack<>();
	    }

	    public void enqueue(int item) {
	        inStack.push(item);
	    }

	    public int dequeue() {
	        if (outStack.isEmpty()) {
	            while (!inStack.isEmpty()) {
	                outStack.push(inStack.pop());
	            }
	        }
	        return outStack.pop();
	    }
	    public static void main(String[] args) {
	    	StackUsingQueue s=new StackUsingQueue();
	    	s.enqueue(10);
	    	s.enqueue(20);
	    	s.enqueue(30);
	    	s.enqueue(40);
	    	System.out.println(s.dequeue());
	    	s.dequeue();
	    	
	    	
	    	
		}
	
	

}
