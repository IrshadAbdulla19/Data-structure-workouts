package stackAndQ;

public class QueueMain {
	public static void main(String[] args) {
		QueueWork queue=new QueueWork();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
	}
}
