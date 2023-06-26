package treeDataStructure;

public class NewBinaryTree {
	 static class Node {
	        int data;
	        Node left;
	        Node right;

	        public Node(int data) {

	            this.data = data;
	        }

	        public void insert(int value) {
	            if (value <= data) {
	                if (left == null) {
	                    left = new Node(value);
	                } else {
	                    left.insert(value);
	                }
	            } else {
	                if (right == null) {
	                    right = new Node(value);
	                } else {
	                    right.insert(value);
	                }
	            }
	        }



	        public Node delete(int value) {
	            if (value < data) {
	                if (left != null) {
	                    left = left.delete(value);
	                }
	                return this;
	            } else if (value > data) {
	                if (right != null) {
	                    right = right.delete(value);
	                }
	                return this;
	            } else {
	                if (left == null) {
	                    return right;
	                } else if (right == null) {
	                    return left;
	                } else {
	                    Node temp = right;
	                    while (temp.left != null) { 
	                        temp = temp.left;
	                    }
	                    data = temp.data; 
	                    right = right.delete(temp.data);  
	                    return this;
	                }
	            }
	        }

	        public boolean contains(int value) {
	            if (value == data) {
	                return true;
	            } else if (value < data) {
	                if (left == null) {
	                    return false;
	                } else {
	                    return left.contains(value);
	                }
	            } else {
	                if (right == null) {
	                    return false;
	                } else {
	                    return right.contains(value);
	                }
	            }
	        }

	        public void printInOrder() {
	            if (left != null) {
	                left.printInOrder();
	            }
	            System.out.print(data+" ");
	            if (right != null) {
	                right.printInOrder();
	            }
	        }

	        public void preOrderPrint() {

	            System.out.print(data+" ");
	            if (left != null) {
	                left.preOrderPrint();
	            }
	            if (right != null) {
	                right.preOrderPrint();
	            }

	        }

	        public void postOrderPrint() {
	            if (left != null) {
	                left.postOrderPrint();
	            }
	            if (right != null) {
	                right.postOrderPrint();
	            }
	            System.out.print(data+" ");
	        }
	    }



	    public int findClosestValue(Node root, int target) {
	        int closest = root.data;
	        int minDiff = Math.abs(root.data - target);

	        while (root != null) {
	            int currentDiff = Math.abs(root.data - target);
	            if (currentDiff < minDiff) {
	                closest = root.data;
	                minDiff = currentDiff;
	            }
	            if (target < root.data) {
	                root = root.left;
	            } else {
	                root = root.right;
	            }
	        }

	        return closest;
	    }



	    public boolean isBST(Node root) {
	        if (root.left== null||root.right==null) {
	            return true;
	        }
	        int minValue=root.left.data;
	        int maxValue=root.right.data;
	        if (root.data < minValue || root.data > maxValue) {
	            return false;
	        }
	        return isBST(root.left)&&
	         isBST(root.right);
	        
	    }
	public static void main(String[] args) {
		NewBinaryTree s=new NewBinaryTree();
		Node sa=new Node(10);
		sa.insert(15);
		sa.insert(21);
		sa.insert(16);
		sa.insert(3);
		sa.insert(8);
		sa.insert(2);
		sa.preOrderPrint();
		System.out.println();
		System.out.println(s.isBST(sa));
//		System.out.println(s.findClosestValue(sa, 4));
//		sa.preOrderPrint();
//		System.out.println();
//		sa.postOrderPrint();
//		System.out.println();
//		sa.printInOrder();
//		System.out.println();
//		System.out.println(sa.contains(16));
//		sa.delete(21);
//		sa.preOrderPrint();

		
	}
}
