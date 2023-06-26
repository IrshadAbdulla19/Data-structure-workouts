package heap;
import java.util.ArrayList;
import java.util.Collections;
public class MaxHeap {

	    private ArrayList<Integer> heap;


	    public MaxHeap() {
	      heap = new ArrayList<>();
	    }

	    public void insert(int value) {
	        heap.add(value);
	        shiftUp(heap.size() - 1);
	    }

	    public int remove() {

	        int min = heap.get(0);
	        Collections.swap(heap,0, heap.size() -1 );
	        heap.remove(heap.size() - 1);
	        shiftDown(0);

	        return  min;

	    }
	    public void buildHeap(int[] values) {
	        for (int value : values) {
	            insert(value);
	        }
	    }
	    public void display() {
	        System.out.println(heap);
	    }

	    private void shiftUp(int currentIndex) { //we are using it in when inserting
	        int parentIndex = (currentIndex - 1) / 2;

	        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parentIndex)) {
	            Collections.swap(heap, currentIndex, parentIndex);
	            currentIndex = parentIndex;
	            parentIndex = (currentIndex - 1) / 2;
	        }
	    }

	    private void shiftDown(int currentIndex) { //we are using it in removing
	        int leftChildIndex = 2 * currentIndex + 1;
	        int rightChildIndex = 2 * currentIndex + 2;

	        int greaterChildIndex;
	        if(rightChildIndex < heap.size()||leftChildIndex < heap.size()) {
	        if (rightChildIndex >= heap.size() || heap.get(leftChildIndex) >= heap.get(rightChildIndex)) {
	            greaterChildIndex = leftChildIndex;
	        } else {
	            greaterChildIndex = rightChildIndex;
	        }

	        //condition to check the smaller child is actually smaller than parent, if so swap
	        if (heap.get(currentIndex) < heap.get(greaterChildIndex)) {
	            Collections.swap(heap, currentIndex, greaterChildIndex);
	            shiftDown(greaterChildIndex);
	        }
	        }

	    }
	    static void Display(int[] arr) {
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	     System.out.println();
	    }
	    public int extractMax() {
	        int result = heap.get(0);
//	        heap.set(0, heap.get(heap.size() - 1));
	        Collections.swap(heap, 0, heap.size() - 1);
	        heap.remove(heap.size() - 1);  //extracting the smallest and removing them
	        shiftDown(0);
	        return result;
	    }

	    public void heapSort(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            insert(arr[i]);
	        }
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = extractMax();
	        }
	    }
	    public static void main(String[] args) {
	        int[] values = {3, 9, 4, 1, 8, 13, 2, 6, 14, 7, 11};
	        MaxHeap max = new MaxHeap();
	        int[] arr= {6,4,14,3,10,7,12,1,5,8};
	        Display(arr);
	        max.heapSort(arr);
	        Display(arr);
	        
//	        max.buildHeap(values);
//	        max.display();
//	        System.out.println(max.remove());
//	        max.display();
//	        max.insert(5);
//	        max.display();
	    }
	}


