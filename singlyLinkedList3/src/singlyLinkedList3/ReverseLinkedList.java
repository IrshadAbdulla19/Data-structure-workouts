package singlyLinkedList3;

public class ReverseLinkedList {
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
	 public void RevreseList() {
		 ListNode temp = head;
	      ListNode previousNode = null;
	      ListNode nextNode =null;

	      while(temp != null){
	            nextNode = temp.next;
	            temp.next = previousNode;
	            previousNode = temp;
	            temp = nextNode;
	      }
	      head = previousNode;


	    }
	 public static void main(String[] args) {
		 ReverseLinkedList s=new ReverseLinkedList();
		 s.InsertNode(10);
		 s.InsertNode(20);
		 s.InsertNode(30);
		 s.InsertNode(40);
		 s.DispalyNode();
		 System.out.println();
		 s.RevreseList();
		 s.DispalyNode();
		 


}

}
