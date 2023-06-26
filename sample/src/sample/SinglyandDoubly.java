package sample;

public class SinglyandDoubly {
	class ListNode{
		int data;
		ListNode next;
		ListNode previous;
		
		ListNode(int data){
			this.data=data;
			
		}
	}
	public ListNode head=null;
	public ListNode tail=null;
	
	public void InsertNode(int data) {
		ListNode node=new ListNode(data);
		if(head==null) {
			head=node;
		}else {
			tail.next=node;
			node.previous=tail;
		}
		tail=node;
	}
	public void Display() {
		if(head==null) {
			System.out.println("Emtey");
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		SinglyandDoubly s=new SinglyandDoubly();
		s.InsertNode(10);
		s.InsertNode(20);
		s.InsertNode(30);
		s.InsertNode(40);
		s.Display();
	}

}
