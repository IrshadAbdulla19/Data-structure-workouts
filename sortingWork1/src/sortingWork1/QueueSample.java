package sortingWork1;

public class QueueSample {
	int[] data;
	static int size=1;
	int end=0;
	
	public QueueSample() {
		this(size);
	}
	public QueueSample(int size) {
		this.data=new int[size];
	}
	public boolean insert(int item) {
		if(isFull()) {
			int[] temp=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		data[end]=item;
		end++;
		return true;
	}
	private boolean isFull() {
		
		return end==data.length;
	}

}
