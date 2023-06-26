package convertListToArray;

import java.util.LinkedList;

public class ListToArray {
	public static void main(String[] args) {
		LinkedList<Integer> List=new LinkedList<>();
		List.add(20);
		List.add(47);
		List.add(15);
		List.add(13);
		List.add(23);
		System.out.println("linkedList:"+List);
		
		
		Integer[] arr=new Integer[List.size()];
		List.toArray(arr);
		System.out.print("array:");
		for(Integer value:arr) {
			System.out.print(value+" ");
		}
	}

}
