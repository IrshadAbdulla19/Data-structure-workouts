package singlyLinkedList3;

public class RemoveDuplicate {
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
	 public void reverse() {
		 if(head==null) {
			 return;
		 }
		 ListNode temp=head;
		 ListNode prev=null;
		 ListNode next=null;
		 while(temp!=null) {
			 next=temp.next;
			 temp.next=prev;			 
			 prev=temp;
			 temp=next;
		 }
		 head=prev;
	 }
	
	public static void main(String[] args) {
		RemoveDuplicate s=new RemoveDuplicate();
		s.InsertNode(10);
		s.InsertNode(20);
		s.InsertNode(20);
		s.InsertNode(20);
		s.InsertNode(20);
		s.InsertNode(30);
		s.InsertNode(30);
		s.InsertNode(40);
		s.DispalyNode();
		System.out.println();
		s.removeDuplicate();
//		s.reverse();
		s.DispalyNode();


}

}
