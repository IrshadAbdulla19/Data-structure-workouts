package sample;

public class StackWkOut {
//	class Node{
//		int data;
//		Node next;
//		public Node(int data){
//			this.data=data;
//		}
//	}
//	public Node top;	
//	public void push(int data) {
//		Node node =new Node(data);
//		if(top==null) {
//			top=node;
//		}else {
//			node.next=top;
//			top=node;
//		}
//	}
//	public int pop() {
//		if(top==null) {
//			throw new IllegalArgumentException("the satack is emty");
//		}
//		Node temp=top;
//		top=top.next;
//		return temp.data;
//	}
//	public void display() {
//		if(top==null) {
//			throw new IllegalArgumentException("the stack is null");
//		}
//		Node temp=top;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
	int[] data;
	static int dfsize=5;
	int ptr=-1;
	StackWkOut(){
		this(dfsize);
	}
	StackWkOut(int size){
		this.data=new int[size];
	}
	public boolean push(int n) {
		if(isFull()) {
			throw new IllegalArgumentException("the stack is full");
		}
		ptr++;
		data[ptr]=n;
		return true;
	}
	public int pop() {
		if(isEmty()) {
			throw new IllegalArgumentException("the stack is emty");
		}
		int remove=data[ptr];
		ptr--;
		return remove;
	}
	public int peek() {
		if(isEmty()) {
			throw new IllegalArgumentException("the stack is emty");
		}
		return data[ptr];
	}
	public void display() {
		if(isEmty()) {
			throw new IllegalArgumentException("the stack is emty");
		}
		for(int i=ptr;i>=0;i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	
	private boolean isEmty() {
		
		return ptr==-1;
	}
	private boolean isFull() {
		
		return ptr==data.length-1;
	}
	
	public static void main(String[] args) {
		StackWkOut s=new StackWkOut();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
//		s.push(60);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
	}

}
