package treeDataStructure;

public class BinarySearchTree {
	class TreeNode{
		int data;
		TreeNode left,right;
		public TreeNode(int data) {
			this.data=data;
		}
	}
	TreeNode root;
	public void Insert(int data) {
		TreeNode currentnode=root;
		if(root==null) {
			root=new TreeNode(data);
			return;
		}
		while(true) {
			if(data<currentnode.data) {
				if(currentnode.left==null) {
					currentnode.left=new TreeNode(data);
					break;
				}else {
					currentnode=currentnode.left;
				}
			}else {
				if(currentnode.right==null) {
					currentnode.right=new TreeNode(data);
					break;
				}else {
					currentnode=currentnode.right;
				}
			}
		}
	}
	public boolean contains(int data) {
		TreeNode currentnode=root;
		while(currentnode!=null) {
			if(data<currentnode.data) {
				currentnode=currentnode.left;
			}else if(data>currentnode.data) {
				currentnode=currentnode.right;
			}else {
				return true;
			}
		}
		return false;
	}
	public void remove(int data) {
		removeHelper(data,root,null);
	}
	private void removeHelper(int data, TreeNode currentnode,TreeNode parantnode) {
		while(currentnode!=null) {
			if(data<currentnode.data) {
				parantnode=currentnode;
				currentnode=currentnode.left;
			}else if(data>currentnode.data) {
				parantnode=currentnode;
				currentnode=currentnode.right;
			}else {
				if(currentnode.left!=null&&currentnode.right!=null) {
					currentnode.data=getMinValue(currentnode.right);
					removeHelper(currentnode.data, currentnode.right, parantnode);
				}else {
					if(parantnode==null) {
						if(currentnode.right==null) {
							root=currentnode.left;
						}else {
							root=currentnode.right;
						}
					}else {
						if(parantnode.left==currentnode) {
							if(currentnode.right==null) {
								parantnode.left=currentnode.left;
							}else {
								parantnode.left=currentnode;
								
							}
						}else {
							if(currentnode.right==null) {
								parantnode.right=currentnode.left;
							}else {
								parantnode.right=currentnode;								
							}
						}
					}
				}
				break;
			}
		}		
	}
	public int getMinValue(TreeNode currenNode) {
		if(currenNode.left==null) {
			return currenNode.data;
		}else {
			return getMinValue(currenNode.left);
		}
	}
	public void inOrder() {
		inOrderHelper(root);
	}
	private void inOrderHelper(TreeNode currentnode) {
		if(currentnode!=null) {
			inOrderHelper(currentnode.left);
			System.out.print(currentnode.data+" ");
			inOrderHelper(currentnode.right);
		}
		
		
	}
	public void preOrder() {
		preOrderHelper(root);
	}
	public void preOrderHelper(TreeNode node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			preOrderHelper(node.left);
			preOrderHelper(node.right);
		}
		
	}
	public void postOrder() {
		postOrderHelper(root);
	}
	private void postOrderHelper(TreeNode node) {
		if(node!=null) {
		postOrderHelper(node.left);
		postOrderHelper(node.right);
		System.out.print(node.data+" ");
		}
		
	}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.Insert(10);
		tree.Insert(8);
		tree.Insert(11);
		tree.Insert(4);
		tree.Insert(9);
		tree.Insert(3);
		tree.Insert(5);
		tree.Insert(14);
		tree.Insert(13);
		
//		tree.remove(11);
//		System.out.println(tree.contains(10));
		tree.inOrder();
		System.out.println();
		tree.preOrder();
		System.out.println();
		tree.remove(8);
//		tree.preOrder();
		System.out.println();
		tree.postOrder();
		
	}

}
