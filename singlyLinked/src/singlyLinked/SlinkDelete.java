package singlyLinked;

public class SlinkDelete {
	
	class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
		
	}
	public Node head=null;
	public Node tail=null;
	public int size=1;
	
	public void InsertNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}else {
			tail.next=n;
		}
		tail=n;
	}
	public void Display() {
		if(head==null) {
			System.out.println("Emtey");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public boolean Find(int searchKey) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==searchKey) {
				return true;
			}else {
				temp=temp.next;
				size++;
			
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		SlinkDelete s=new SlinkDelete();
		s.InsertNode(10);
		s.InsertNode(20);
		s.InsertNode(30);
		s.Display();
		if(s.Find(60)) {
			System.out.println("search key is found in the position "+s.size );
		}else {
			System.out.println("searchkey is not found");
		}
	}

}
