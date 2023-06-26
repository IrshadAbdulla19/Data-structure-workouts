package sample;

public class QueueLiList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	public Node front;
	public Node back;
	
	public void enqueue(int data) {
		Node node=new Node(data);
		if(back==null) {
			front=back=node;
			return;
		}else {
		back.next=node;
		back=node;
		}
	}
	public void dequeue() {
		if(front==null) {
			System.out.println("the queue is emty");
		}
		front=front.next;
		if(front==null) {
			back=null;
		}
	}
	public void display() {
		if(front==null) {
			System.out.println("the queue is emty");
		}
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		QueueLiList s=new QueueLiList();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		s.display();
		s.dequeue();
		s.display();
	}

}
