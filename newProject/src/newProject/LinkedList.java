package newProject;

public class LinkedList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void NodeInsert(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}else {
			tail.next=n;
		}
		tail=n;
	}
	public void Display() {
		if(head==null) {
			System.out.println("Emety");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void InsretFirst(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
				
	}
	public static void main(String[] args) {
		LinkedList s=new LinkedList();
		s.NodeInsert(10);
		s.NodeInsert(8);
		s.NodeInsert(7);
		s.InsretFirst(12);
		
		
		s.Display();
	}

}
