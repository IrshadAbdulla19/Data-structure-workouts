package newRecursion;

public class NewWorkOut {
	class ListNode {
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
	
	public void Display() {
		if(head==null) {
			System.out.println("emtey");
		}
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" " );
			temp=temp.next;
		}
	}
	public void removeDuplicate() {
		if(head==null) {
			return;
		}
		ListNode temp=head;
		while(temp!=null&&temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
	}
	public void deleteByValue(int data) {
		ListNode node=new ListNode(data);
		if(head==node) {
			head=head.next;
		}
		ListNode temp=head;
		while(temp.next.data!=data) {
			temp=temp.next;
		}
		if(temp.next.data==data) {
			temp.next=temp.next.next;
		}else {
			System.out.println("note found");
		}
		
	}
	public static void main(String[] args) {
		NewWorkOut s=new NewWorkOut();
		s.InsertNode(10);
		s.InsertNode(10);
		s.InsertNode(20);
		s.InsertNode(20);
		s.InsertNode(20);
		s.InsertNode(30);
		s.InsertNode(40);
		s.Display();
		s.removeDuplicate();
		System.out.println();
		s.deleteByValue(30);
		s.Display();
	}

}
