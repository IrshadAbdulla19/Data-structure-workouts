package stackAndQ;

public class StackWorkOut {

	private int[] data;
	private static int size=1;	
	private int ptr=-1;
	
	public StackWorkOut() {
		this(size);
	}
	
	public StackWorkOut(int size) {
		this.data=new int[size];
	}
	
	public boolean push(int item) {
		if(isfull()) {
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
	public int pop() {
		if(isEmty()) {
			 System.out.println("cannot pop from emty stack");
			 return -1;
		}
		int removed=data[ptr];
		ptr--;
		return removed;
	}
	public int peek() {
		if(isEmty()) {
			System.out.println("cannot peek from emty stack");
			return -1;
		}
		return data[ptr];
	}
	public boolean isfull() {		
		return ptr==data.length-1;		
	}
	public boolean isEmty() {	
		return ptr==-1;		
	}
}

