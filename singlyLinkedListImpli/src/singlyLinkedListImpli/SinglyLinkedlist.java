package singlyLinkedListImpli;

public class SinglyLinkedlist {
	
	 class ListNode{
		 int data;
		 ListNode next;
		
		public ListNode(int data) {
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
	 public void DispalyNode() {
		 if(head==null) {
			 System.out.println("Emtey");
			 return;
		 }
		 ListNode temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 
	 }
	 public void InsertFirst(int data) {
		 ListNode node=new ListNode(data);
		 node.next=head;
		 head=node;
		 
	 }
	 public void InsertByPosition(int data,int position) {
		 ListNode node=new ListNode(data);
		 if(position==1) {
			 node.next=head;
			 head=node;
		 }else {
			ListNode prev=head;
			int count=1;
			while(count<position-1) {
				prev=prev.next;
				count++;
			}
			ListNode temp=prev.next;
			prev.next=node;
			node.next=temp;
		 }
	 }
	 public ListNode DeleteFirst() {
		 if(head==null) {
			 return null;
		 } 
		 ListNode temp=head;
		 head=head.next;
		 temp.next=null;
		 return temp;
	 }
	 public ListNode DeleteLast() {
		 if(head==null||head.next==null) {
			 return head;
		 }
		 ListNode temp=head;
		 ListNode prev=null;
		 while(temp.next!=null) {
			 prev=temp;
			 temp=temp.next;
		 }
		 prev.next=null;
		 return temp;
	 }
	 public void DeleteByposition(int position) {
		 if(position==1) {
			 head=head.next;
		 }else {
			 ListNode prev=head;
			 int count=1;
			 while(count<position-1) {
				 prev=prev.next;
				 count++;
			 }
			 ListNode temp=prev.next;
			 prev.next=temp.next;
		 }
	 }
	 public void DeleteByValue(int value) {
		 if(head==null) {
			 System.out.println("There is no value to delete");
			return;
		 }
		 if(head.data==value) {
			 head=head.next;
		 }else {
			 ListNode prev=head;
			 while(prev.next.data!=value||prev.next==null) {
				if(prev.next==null) {
					System.out.println("Value not found");
				}else {
				 prev=prev.next;
				}
			 }if(prev.next != null) {
				 ListNode remove=prev.next;
				 prev.next=remove.next;
				 return ;
			 }
			 
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 SinglyLinkedlist s=new SinglyLinkedlist();
		 s.InsertNode(12);
		 s.InsertNode(20);
		 s.InsertNode(30);
		 s.InsertNode(40);
		 s.InsertNode(50);
		 s.InsertNode(60);
//		 s.InsertFirst(34);
//		 s.InsertFirst(40);
//		 s.InsertFirst(54);
//		 s.InsertNode(26);
//		 s.InsertByPosition(29, 4);
//		 s.DeleteByposition(3);
//		 s.DeleteFirst();
//		 s.DeleteFirst();
//		 s.DeleteLast();
//		 s.DeleteLast();
		 s.DeleteByValue(70);
		 s.DispalyNode();
	}
	 
	 

}
