package sample;

public class BSTwk {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
		}
		public void insert(int value) {
			if(value<=data) {
				if(left==null) {
					left=new Node(value);
				}else {
					left.insert(value);
				}
			}else {
				if(right==null) {
					right=new Node(value);
				}else {
					right.insert(value);
				}
			}
		}
		public Node delete(int value) {
			if(value<data) {
				if(left!=null) {
					left=left.delete(value);
				}
				return this;
			}else if(value>data) {
				if(right!=null) {
					right=right.delete(value);
				}
				return this;
			}else {
				if(right==null) {
					return left;
				}
				else if(left==null) {
					return right;
				}else {
					Node temp=right;
					while(temp.left!=null) {
						temp=temp.left;
					}
					data=temp.data;
					right=right.delete(temp.data);
					return this;
				}
			}
		}
		public boolean contains(int value) {
			if(value==data) {
				return true;
			}else if(value<data) {
				if(left==null) {
					return false;
				}else {
					return left.contains(value);
				}
			}else {
				if(right==null) {
					return false;
				}else {
					return right.contains(value);
				}
			}
		}
		public void preOrder() {
			System.out.println(data);
			if(left!=null) {
				left.preOrder();
			}
			if(right!=null) {
				right.preOrder();
			}
		}
		
	}

}
