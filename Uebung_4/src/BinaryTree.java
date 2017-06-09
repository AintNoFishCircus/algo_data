
public class BinaryTree{
	
	static class TreeNode{
		Object key;
		TreeNode leftChild;
		TreeNode rightChild;
		
		public TreeNode(Object key){
			this.key = key;
			this.leftChild = null;
			this.rightChild = null;
		}
		
		public Object getKey(){
			return key;
		}
		
		public void setKey(Object key){
			this.key = key;
		}
		
		public TreeNode getLeftChild(){
			return leftChild;
		}
		
		public void setLeftChild(TreeNode n){
			this.leftChild = n;
		}
		
		public TreeNode getRightChild(){
			return rightChild;
		}
		
		public void setRightChild(TreeNode n){
			this.rightChild = n;
		}
		
		
	
		public int compareKeyTo(Comparable c){
			if(key == null){
				return -1;
		}else{
			return ((Comparable)key).compareTo(c);
		}


		}
	}
	
	
	private TreeNode head, nullNode;
	
	public BinaryTree(){
		head = new TreeNode(null);
		nullNode = new TreeNode(null);
		nullNode.setLeftChild(nullNode);
		nullNode.setRightChild(nullNode);
		head.setRightChild(nullNode);
	}
	
	
	public boolean insert (Comparable c){
		TreeNode parent = head;
		TreeNode child = head.getRightChild();
		while (child != nullNode){
			parent = child;
			
			int res = child.compareKeyTo(c);
			
			if( res == 0){
				return false;
			}else if( res < 0){
				child = child.getLeftChild();
				
			}else{
				child = child.getRightChild();
			}
		}
		
		TreeNode node = new TreeNode(c);
		if (parent.compareKeyTo(c) > 0){
			parent.setLeftChild(node);
			return true;
		}else{
			parent.setRightChild(node);
			return true;
		}
		
	}


	public TreeNode find (Comparable c){
		TreeNode temp = head.getRightChild();
		while(temp != nullNode){
			if(temp.compareKeyTo(c)==0){
				return temp;
			}else if(temp.compareKeyTo(c)<0){
				temp = temp.getRightChild();
			}else{
				temp = temp.getLeftChild();
			}
		}
		return null;
	}
}
		
