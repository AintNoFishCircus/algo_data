package grundlegendeDatenstrukturen;

public class BinaryTree {
	static class TreeNode{
		Object key;
		TreeNode left = null;
		TreeNode right = null;
		
		public TreeNode(Object e){
			e = key;
		}
		
		public TreeNode getLeft(){
			return left;
		}
		
		public TreeNode getRight(){
			return right;
		}
		
		public void setLeft(TreeNode n){
			this.left = n;
		}
		
		public void setRight(TreeNode n){
			this.right = n;
			
		}
	}
	
	public BinaryTree(){
		
	}
	
	

}
