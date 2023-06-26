package sample;

public class QueueWkOut {
//	class Node{
//		int data;
//		Node next;
//		public Node(int data){
//			this.data=data;
//		}		
//	}
//	public Node front;
//	public Node back;
//	
//	public void enqueue(int data) {
//		Node node =new Node(data);
//		if(front==null) {
//			front=back=node;
//		}else {
//		back.next=node;
//		}
//		back=node;
//	}
//	public void dequeue() {
//		if(front==null) {
//			throw new IllegalArgumentException("the queue is null");
//		}
//		front=front.next;
//	}
//	public void display() {
//		if(front==null) {
//			System.out.println("the queue is emty");
//			return;
//		}
//		Node temp=front;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
	int[] data;
	static int dfsize=4;
	int end=0;
	QueueWkOut(){
		this(dfsize);
	}
	QueueWkOut(int size){
		this.data=new int[size];
	}
	public boolean enqueue(int n) {
		if(isFull()) {
			throw new IllegalArgumentException("the queue is full");
		}
		data[end]=n;
		end++;
		return true;	
	}
	public int dequeue() {
		if(isEmty()) {
			throw new IllegalArgumentException("the queue is emty");
		}
		int remove=data[0];
		for(int i=0;i<end-1;i++) {
			data[i]=data[i+1];
		}
		end--;
		return remove;
	}
	public void display() {
		if(isEmty()) {
			throw new IllegalArgumentException("the queue is emty");
		}
		for(int i=0;i<end;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	private boolean isEmty() {
		
		return end==0;
	}
	private boolean isFull() {
		
		return end==data.length;
	}
	public static void main(String[] args) {
		QueueWkOut q=new QueueWkOut();
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
//		q.display();
		q.dequeue();
		q.display();
	}
}
