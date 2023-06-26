package sample;

public class ArrayToList {
	    Node head;
	    
	    static class Node {
	        int data;
	        Node next;
	        
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    
	    public void insertArr(int[] arr) {
	        for (int i : arr) {
	            Node node = new Node(i);
	            if (head == null) {
	                head = node;
	            } else {
	                Node temp = head;
	                while (temp.next != null) {
	                    temp = temp.next;
	                }
	                temp.next = node;
	            }
	        }
	    }
	    
	    public void printList() {
	        Node n = head;
	        while (n != null) {
	            System.out.print(n.data + " ");
	            n = n.next;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        ArrayToList list = new ArrayToList();
	        list.insertArr(arr);
	        list.printList();
	    }
	}


