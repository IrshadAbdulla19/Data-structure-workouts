package singleLinkedList1;

public class AddNode {
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
	 public static void main(String[] args) {
		 AddNode s=new AddNode();
		 s.InsertNode(10);
		 s.InsertNode(20);
		 s.InsertNode(30);
		 s.InsertFirst(40);
		 s.DispalyNode();
		 


}

}
