package trees;


public class TreeNode{
	
	protected Object key;
	protected TreeNode rightChild;
	protected TreeNode leftChild;
	
	public TreeNode(Object key){
		
		this.key = key;
		setRight(null);
		setLeft(null);
	}
	
	public Object getKey(){
		return this.key;
	}
	
	public void setLeft(TreeNode left){
		leftChild = left;
	}
	
	public TreeNode getLeft(){
		return leftChild;
	}
	
	public TreeNode getRight(){
		return rightChild;
	}
	
	
	public void setRight(TreeNode right){
		rightChild = right;
	}
	
	public int compareKeyTo(Comparable c){
		if(key == null){
			return -1;
		}else{
			return (((Comparable)key).compareTo(c));
		}
	}
	
	
	

}
