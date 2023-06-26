package stackAndQ;

public class QueueWork {
	int[] data;
	static int size=1;
	int end=0;
	
	public QueueWork() {
		this(size);
	}
	public QueueWork(int size) {
		this.data=new int[size];
	}
	public boolean isFull() {
		return end==data.length;
	}
	public boolean isEmty() {
		return end==0;
	}
	public boolean insert(int item) {
		if(isFull()) {
			int[] temp=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		data[end++]=item;
		return true;
	}
	public int remove() {
		if(isEmty()) {
			System.out.println("the queue is emty");
		}
		int removed=data[0];
		for(int i=1;i<end;i++) {
			data[i-1]=data[i];
			
		}
		end--;
		return removed;
	}
	public int front() {
		if(isEmty()) {
			System.out.println("the queue is emty");
		}
		return data[0];
	}
	public void display() {
		for(int i=0;i<end;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
