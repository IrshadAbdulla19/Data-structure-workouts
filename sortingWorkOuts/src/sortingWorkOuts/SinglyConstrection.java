package sortingWorkOuts;

public class SinglyConstrection {
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
		public void revrse() {
			if(head==null) {
				return;
			}
			ListNode temp=head;
			ListNode next=null;
			ListNode prev=null;
			while(temp!=null) {
				next=temp.next;
				temp.next=prev;
				prev=temp;
				temp=next;
			}
			head=prev;
		}
		public void AddinTheFrond(int data) {
			ListNode node= new ListNode(data);
			if(head==null) {
				head=node;
			}else {
				node.next=head;
				head=node;
			}
			
		}
		public void deleteByVlue(int data) {
			if(head==null) {
				return;
			}
			ListNode temp=head;
			while(temp!=null&&temp.next.data!=data) {
				temp=temp.next;
			}
			if(temp.next!=null) {
				ListNode prev=temp;
				prev.next=temp.next.next;
			}
		}
		public void beforeValue(int data,int adddata) {
			ListNode node=new ListNode(adddata);
			if(head.data==data) {
				node.next=head;
				head=node;
				return;
			}
			ListNode temp=head;
			ListNode prev=null;
			while(temp!=null&&temp.next.data!=data) {
				prev=temp;
				temp=temp.next;
			}
			if(temp.next!=null) {
				prev=temp;
				temp=temp.next;
				node.next=temp;
				prev.next=node;
			}
		}
		public void aftreValue(int data,int addData) {
			ListNode node=new ListNode(addData);
			ListNode temp=head;
			if(head.data==data) {
				temp=temp.next;
				head.next=node;
				node.next=temp;
				return;				
			}
			ListNode aftr=null;
			while(temp!=null&&temp.next.data!=data) {
				temp=temp.next;
				aftr=temp.next;
			}
			if(temp.next!=null) {
				temp=temp.next;
				aftr=temp.next;
				node.next=aftr;
				temp.next=node;
			}
			
		}
		public void DuplicateDelete() {
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
		
		public static void main(String[] args) {
			SinglyConstrection s=new SinglyConstrection();
			s.InsertNode(10);
			s.InsertNode(20);
			s.InsertNode(20);
			s.InsertNode(20);
			s.InsertNode(30);
			s.InsertNode(30);
			s.InsertNode(40);
			s.InsertNode(40);
			s.DuplicateDelete();
//			s.AddinTheFrond(50);
//			s.deleteByVlue(20);
//			s.beforeValue(50, 15);
//			s.aftreValue(50, 12);
			s.Display();
			
//			s.revrse();
//			s.Display();
		}
	

}
