package convertListToArray;

public class CovertArrayToList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void ArrayToList(int[] arr) {
		for(int i:arr) {
			Node node=new Node(i);
			if(head==null) {
				head=node;
			}else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=node;
			}
		}
	}
	public void Display() {
		if(head==null) {
			System.out.println("Emtey");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		CovertArrayToList s=new CovertArrayToList();
		s.ArrayToList(arr);
		s.Display();
		
	}

}
