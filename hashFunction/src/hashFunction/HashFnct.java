package hashFunction;

public class HashFnct {
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;
	
	public HashFnct(){
		this(1);
	}
	public HashFnct(int capacity){
		this.numOfBuckets=capacity;
		this.buckets=new HashNode[numOfBuckets];
		this.size=0;
	}
	public class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key,String value) {
			this.key=key;
			this.value=value;
		}
	}
	public int size() {
		return size;
	}
	public boolean isEmty() {
		return size==0;
	}
	public void put(Integer key,String value) {
		if(key==null||value==null) {
			throw new IllegalArgumentException("key or value is null!!!");
		}
		int bucketIdx=getBucketIdx(key);
		HashNode head=buckets[bucketIdx];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
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
			throw new IllegalArgumentException("the key is null!!!");
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
		HashFnct s=new HashFnct();
		s.put(34, "irshad");
		s.put(45, "nishad");
		s.put(75, "sana");
		s.put(85, "musi");
		s.put(98, "ajmal");
		s.put(43, "hsdjdh");
		System.out.println(s.size);
		System.out.println(s.get(75));
		System.out.println(s.get(45));
		System.out.println(s.remove(45));
		System.out.println(s.get(45));
		System.out.println(s.get(43));
		System.out.println(s.get(85));
	}

}
