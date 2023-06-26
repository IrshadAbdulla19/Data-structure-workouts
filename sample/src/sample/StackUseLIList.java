package sample;

public class StackUseLIList {
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
	public Node top;
	
	public void push(int data) {
		Node node =new Node(data);
		if(top==null) {
			top=node;
		}else {
			node.next=top;
			top=node;
		}			
	}
	public void pop() {
		if(top==null) {
			System.out.println("top is emty");
			return;
		}
		if(top!=null) {
			top=top.next;
		}		
	}
	public void peek() {
		System.out.println(top.data);
	}
	public void display() {
		if(top==null) {
			System.out.println("the stack is emty");
		}
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackUseLIList s=new StackUseLIList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
	}
	
}

