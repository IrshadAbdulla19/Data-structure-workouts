package sample;

public class RecrtionRevrseLiList {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void InsretNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}else {
			tail.next=n;
		}
		tail=n;
	}
	public void Dispalay() {
		if(head==null) {
			System.out.println("Emtey");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		RecrtionRevrseLiList s=new RecrtionRevrseLiList();
		s.InsretNode(10);
		s.InsretNode(20);
		s.InsretNode(30);
		s.InsretNode(40);
		s.InsretNode(50);
		s.Dispalay();
		
	}

}
