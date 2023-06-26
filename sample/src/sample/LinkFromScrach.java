package sample;

public class LinkFromScrach {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void InsertNode(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			tail.next=node;
		}
		tail=node;
	}
	public void Display() {
		if(head==null) {
			System.out.println("Emtey");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void InsertFirst(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;			
		}else {
			node.next=head;
		}
		head=node;		
	}
	public void Reverse() {
		if(head==null) {
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
			Node nxt=temp.next;
			temp.next=prev;
			prev=temp;
			temp=nxt;
		}
		head=prev;
	}
	public void DeleteDuplicate() {
		if(head==null) {
			return;
		}
		Node temp=head;
		while(temp!=null&&temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
	}
	public void DeleteByValue(int data) {
//		Node node =new Node(data);
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node temp=head;
		Node aftr=temp.next;
		while(temp.next.data!=data) {
			temp=temp.next;
			aftr=temp.next;			
		}
		if(temp.next!=null) {
			temp.next=aftr.next;
		}
	}
	
	public static void main(String[] args) {
		LinkFromScrach s=new LinkFromScrach();
		s.InsertNode(10);
		s.InsertNode(20);
//		s.InsertNode(20);
//		s.InsertNode(20);
//		s.InsertNode(20);
//		s.InsertNode(30);
		s.InsertNode(30);
		s.InsertNode(40);
		s.InsertFirst(5);
//		s.Display();
//		s.DeleteDuplicate();
//		s.Reverse();
		s.DeleteByValue(20);
		s.Display();
	}

}
