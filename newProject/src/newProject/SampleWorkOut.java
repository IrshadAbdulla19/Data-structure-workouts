package newProject;

public class SampleWorkOut {
	class ListNode{
		int data;
		ListNode next;
		
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
		}
		tail=node;
	}
	public void dispaly() {
		if(head==null) {
			System.out.println("emtey");
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void reverse() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		ListNode prev=null;
		ListNode nxt=null;
		while(temp!=null) {
			nxt=temp.next;
			temp.next=prev;
			prev=temp;
			temp=nxt;
			nxt=temp.next;
			temp.next=prev;
		}

	}
	public static void main(String[] args) {
		SampleWorkOut s=new SampleWorkOut();
		s.InsertNode(10);
		s.InsertNode(20);
		s.InsertNode(30);
		s.reverse();
		s.dispaly();
	}
	

}
