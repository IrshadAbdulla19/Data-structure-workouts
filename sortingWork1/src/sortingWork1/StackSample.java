package sortingWork1;

public class StackSample {
	int[] data;
	static int size=1;
	int ptr=-1;
	public StackSample() {
		this(size);
	}
	public StackSample(int size) {
		this.data=new int[size];
	}
	public boolean push(int item) {
		if(isFull()) {
			int[] temp=new int[data.length*2];
			for(int i=0;i<data.length;i++) {
				temp[i]=data[i];
			}
			data=temp;
		}
		ptr++;
		data[ptr]=item;
		return true;
	}
	private boolean isFull() {
		return ptr==data.length;
	}
	public int pop() {
		if(isEmty()) {
			System.out.println("the stack is emty");
		}
		int removed=data[ptr];
		ptr--;
		return removed;
	}
	private boolean isEmty() {
		return ptr==-1;
	}
	public int peek() {
		if(isEmty()) {
			System.out.println("stack is emty");
		}
		return data[ptr];
	}

}
