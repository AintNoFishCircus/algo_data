package trees;

public class AVLNode{
	
	private Object key;
	private AVLNode leftChild;
	private AVLNode rightChild;
	private int balance;
	
	public AVLNode(Object e){
		this.key = e;
		setBalance(0);
	}
	
	public int compareKeyTo(Comparable c){
		if(key == null){
			return -1;
		}else{
			return ((Comparable)key).compareTo(c);
		}
	}
	public Object getKey(){
		return key;
	}
	
	public AVLNode getLeft(){
		return leftChild;
	}
	
	public void setLeft(AVLNode left){
		this.leftChild = left;
	}
	
	public AVLNode getRight(){
		return rightChild;
	}
	
	public void setRight(AVLNode right){
		this.rightChild = right;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	
}
