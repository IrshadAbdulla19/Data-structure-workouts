package singlyLinkedList2;

public class DeleteByValue {
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
	 public void deleteByValue(int value) {
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
		 DeleteByValue s=new DeleteByValue();
		 s.InsertNode(10);
		 s.InsertNode(20);
		 s.InsertNode(30);
		 s.InsertNode(40);
		 s.DispalyNode();
		 s.deleteByValue(30);
		 System.out.println();
		 s.DispalyNode();


}
	 

}
