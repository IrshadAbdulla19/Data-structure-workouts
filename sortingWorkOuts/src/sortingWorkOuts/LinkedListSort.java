package sortingWorkOuts;

public class LinkedListSort {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			
		}
	}
	public Node head;
	public Node tail;
	
	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			tail.next=node;
		}
		tail=node;
	}
	public void display() {
		if(head==null) {
			System.out.println("emty");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public int NumOfElmts() {
		int c=0;
		Node temp=head;
		if(head!=null) {
		while(temp!=null) {
			temp=temp.next;
			c++;
		}
		}
		return c;
	}
	public void sorting() {
		int c=NumOfElmts();
		
		for(int i=0;i<c;i++) {
			Node temp=head;
			Node temp1=temp.next;
			for(int j=0;j<c-i-1;j++) {								
				if(temp.data>temp1.data) {
					int n=temp.data;
					temp.data=temp1.data;
					temp1.data=n;
				}
				temp=temp1;
				temp1=temp1.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListSort s=new LinkedListSort();
		s.insert(30);
		s.insert(50);
		s.insert(20);
		s.insert(10);
		s.insert(40);
		s.display();
		s.sorting();
		s.display();
	}

}
