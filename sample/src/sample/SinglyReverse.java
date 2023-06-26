package sample;

public class SinglyReverse {
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
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void revrse() {
		if(head==null&&head.next==null) {
			return;
		}
		Node prev=null;
		Node temp=head;
		while(temp!=null) {
			Node next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		head=prev;
		
	}
	public Node RecertionRev(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newHead=RecertionRev(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
	}
	public void FindMiddleEle() {
		if(head==null) {
			return;
		}
		Node mid=head;
		Node last=head;
		while(last!=null&&last.next!=null) {
			mid=mid.next;
			last=last.next.next;
		}
		Node temp=head;
		Node dele=head.next;
		while(temp.next!=mid) {
			temp=temp.next;
			dele=dele.next;
		}
		if(temp.next!=null) {
			temp.next=dele.next;
		}
		
		
	}
	public static void main(String[] args) {
		SinglyReverse s=new SinglyReverse();
		s.InsertNode(5);
		s.InsertNode(10);
		s.InsertNode(20);
//		s.InsertNode(30);
//		s.InsertNode(40);
		s.Display();
		System.out.println();
//		Node mid=s.FindMiddleEle();
//		System.out.println(mid.data); 
//		s.head=s.RecertionRev(s.head);
//		s.revrse();
//		s.Display();
	}

}
