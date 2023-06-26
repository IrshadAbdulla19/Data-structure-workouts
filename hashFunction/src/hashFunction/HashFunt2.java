package hashFunction;

import hashFunction.HashFnct.HashNode;

public class HashFunt2 {
	HashNode[] buckets;
	int numOfBuckets;
	static int DfSize;
	 int size;
	 
	public HashFunt2() {
		this(DfSize);
	}
	public HashFunt2(int capasity) {
		this.numOfBuckets=capasity;
		this.buckets=new HashNode[numOfBuckets];
		this.size=0;
	}
	public class HashNode{
		Integer key;
		String value;
		HashNode next;
		 
		public HashNode(Integer key,String value) {
			this.key=key;
			this.value=value;
		}
	}
	public void put(Integer key,String value) {
		if(key==null||value==null) {
			throw new IllegalArgumentException("the key and value is emty");
		}
		int bucketIdx=getBucketIdx(key);
		HashNode head=buckets[bucketIdx];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
			}
			head=head.next;
		}
		size++;
		head=buckets[bucketIdx];
		HashNode node=new HashNode(key, value);
		node.next=head;
		buckets[bucketIdx]=node;
		
	}
	private int getBucketIdx(Integer key) {
		return key%numOfBuckets;
	}
	public String get(Integer key) {
		if(key==null) {
			throw new IllegalArgumentException("the key is null");
		}
		int bucketIdx=getBucketIdx(key);
		HashNode head=buckets[bucketIdx];
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	public String remove(Integer key) {
		if(key==null) {
		throw new IllegalArgumentException("the key is null");
		}
		int bucketIdx=getBucketIdx(key);
		HashNode head=buckets[bucketIdx];
		HashNode prev=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			prev=head;
			head=head.next;
		}
		if(head==null) {
			return null;
		}
		if(prev!=null) {
			prev.next=head.next;
		}else {
			buckets[bucketIdx]=head.next;
		}
		return head.value;
	}
	public static void main(String[] args) {
		HashFunt2 s=new HashFunt2(5);
		s.put(101, "irshad");
		s.put(222, "idrshad");
		s.put(233, "irfshad");
		s.put(34, "irshdsfad");
		s.put(75, "irshadasdf");
		s.put(66, "irshadsdf");
		System.out.println(s.get(66));
		
	}
	

}
