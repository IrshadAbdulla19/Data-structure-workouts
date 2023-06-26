package sample;

public class HashTableWk {
	HashNode buckets[];
	int numOfBuks;
	int size;
	
	public HashTableWk() {
		this(10);
	}
	public HashTableWk(int capasity) {
		this.numOfBuks=capasity;
		this.buckets=new HashNode[numOfBuks];
		this.size=0;
	}
	class HashNode{
		Integer key;
		String value;
		HashNode next;
		
		HashNode(Integer key,String value){
			this.key=key;
			this.value=value;
		}
	}
	public void insert(Integer key,String value) {
		int bukIdx=getBukIdx(key);
		HashNode head=buckets[bukIdx];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=buckets[bukIdx];
		HashNode node=new HashNode(key, value);
		node.next=head;
		buckets[bukIdx]=node;
	}
	public String remove(Integer key) {
		int bukIdx=getBukIdx(key);
		HashNode head=buckets[bukIdx];
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
			buckets[bukIdx]=head.next;
		}
		return head.value;
	}
	private int getBukIdx(Integer key) {	
		return key%numOfBuks;
	}

}
