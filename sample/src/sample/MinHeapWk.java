package sample;

import java.util.ArrayList;
import java.util.Collections;

public class MinHeapWk {
	ArrayList<Integer> heap;
	public MinHeapWk() {
		heap=new ArrayList<>();
	}
	
	public void insert(int value) {
		heap.add(value);
		shiftUp(heap.size()-1);
	}

	private void shiftUp(int i) {
		int parantIdx=(i-1)/2;
		
		while(i>0&&heap.get(i)<heap.get(parantIdx)) {
			Collections.swap(heap, i, parantIdx);
			i=parantIdx;
			parantIdx=(i-1)/2;
		}		
	}
	public int remove() {
		int min=heap.get(0);
		Collections.swap(heap, 0, heap.size()-1);
		shiftDown(0);
		return min;
	}

	private void shiftDown(int i) {
		int leftchldIdx=(i*2)+1;
		int rightchldIdx=(i*2)+2;
		
		int lowest;
		if(rightchldIdx>heap.size()||heap.get(rightchldIdx)>heap.get(leftchldIdx)) {
			lowest=leftchldIdx;
		}else {
			lowest=rightchldIdx;
		}
		if(heap.get(lowest)<heap.get(i)) {
			Collections.swap(heap, lowest, i);
			shiftDown(lowest);
		}
		
	}

}
