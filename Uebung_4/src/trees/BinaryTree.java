package trees;
import java.util.ArrayList;

public class BinaryTree {

	protected TreeNode head;
	protected TreeNode nullNode;
	
	
	
	/**
	 * Creates an empty Instance of BinaryTree with a pointer <code>head</code>
	 * and a <code>nullNode</code>. This node terminates the tree. So each leaf of
	 * the BinaryTree has to point at <code>nullNode</code>
	 */
	public BinaryTree(){
		head = new TreeNode(null);
		nullNode = new TreeNode(null);
		head.setRight(nullNode);
		nullNode.setLeft(nullNode);
		nullNode.setRight(nullNode);
	
	}
	
	/**
	 * Returns the root of the BinaryTree <code>head.getRight()</code>
	 * @return The first value of the tree
	 */
	public TreeNode getRoot(){
		return head.getRight();
	}
	
	/**
	 * Inserts a Comparable <code>c</code> to the tree taking account of the trees's order.
	 * 
	 * @param c
	 * @return
	 */
	public boolean insert(Comparable c){
		TreeNode parent = head;
		TreeNode child = head.getRight();
		
		while(child != nullNode){
			parent = child;
			
			int comp = child.compareKeyTo(c);
			
			if(comp == 0){
				return false;
			}else if(comp < 0){
				child = child.getRight();
			}else{
				child = child.getLeft();
			}
		}
		
		TreeNode n = new TreeNode(c);
		n.setLeft(nullNode);
		n.setRight(nullNode);
		
		
		if(parent.compareKeyTo(c) < 0){
			parent.setRight(n);
			System.out.println("Inserted " + n.getKey() + " to right of node " + parent.getKey());
			return true;
		}else{
			parent.setLeft(n);
			System.out.println("Inserted " + n.getKey() + " to left of node " + parent.getKey());
			return true;
		}
	}
	
	/**
	 * Searches for a node with a key value equal to the given Comparable
	 * @param c The Comparable to be searched
	 * @return True if the given value has been found
	 */
	public boolean find(Comparable c){
		TreeNode n = head.getRight();
		
		while(n != nullNode){
			int comp = n.compareKeyTo(c);

			if(comp == 0){
				return true;
			}else if(comp < 0){
				n = n.getRight();
			}else{
				n = n.getLeft();
			}
		}
		
		return false;
	}
	
	
	/**
	 * Searches for the node containing the minimum value by recursively traversing
	 * through the left subtree until node.getLeft() is nullNode
	 * @return The key of the node with the minimum value 
	 */
	public Object findMinElementRecursively(TreeNode n){
		if(n.getLeft() != nullNode){
				return findMinElementRecursively(n.getLeft());
			
		}
		
		return n.getKey();
	}
	
	/**
	 * Searches for the node containing the minimum value by iteratively traversing
	 * through the left subtree until node.getLeft() is nullNode
	 * @return The key of the node with the minimum value 
	 */
	public Object findMinElementIterativ(){
		TreeNode n = head.getRight();
		
		while(n.getLeft() != nullNode){
			n = n.getLeft();
		}
		
		return n.getKey();
	}
	
	public Object findMaxElement(){
		TreeNode n = head.getRight();
		
		while(n.getRight() != nullNode){
			n = n.getRight();
		}
		
		return n.getKey();
	}
	
	/**
	 * Removes a node from the tree
	 * @param c The Comparable to be deleted
	 * @return True if deletion was successful and false if the given Comparable does not exist in the tree
	 */
	public boolean remove(Comparable c){
		TreeNode parent = head;
		TreeNode node = head.getRight();
		TreeNode child = null;
		TreeNode temp = null;
		
		//Search for match 
		
		while(node != nullNode){
			int comp = node.compareKeyTo(c);
			
			if(comp == 0){
				break;
			}else{
				parent = node;
				if(comp < 0){
					node = node.getRight();
				}else{
					node = node.getLeft();
				}
			}
		}
			if (node == nullNode)
				return false;
			
			//Case 1: The Node which has to be deleted is a leaf 
			
			if (node.getLeft()== nullNode && node.getRight() == nullNode){
				child = nullNode;
			//Case 2: The Node to be deleted has only one successor
			}else if(node.getLeft()== nullNode){
				child = node.getRight();
			}else if(node.getRight() == nullNode){
				child = node.getLeft();
				//Case 3: The Node to be deleted has two successors
			}else{
				child = node.getRight();
				temp = node;
				
				while(child.getLeft()!= nullNode){
					temp = child;
					child = child.getLeft();
				}
				child.setLeft(node.getLeft());
				if(temp != node){
					temp.setLeft(child.getRight());
					child.setRight(temp);
				}
			}
			
			if(parent.getLeft() == node){
				parent.setLeft(child);
			}else{
				parent.setRight(child);
			}
			
			node = null;
			return true;
		
	}
	
	/**
	 * Recursively traverses the tree in Inorder priority which means first left, second root,
	 * third right. 
	 * @param n TreeNode to lookup 
	 */
	public void traverseInorder(TreeNode n){
		if(n!= nullNode){
			traverseInorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			traverseInorder(n.getRight());
		}
		
	}
	
	/**
	 * Recursively traverses the tree in Preorder priority which means first root, second left,
	 * third right.
	 * @param n
	 */
	public void traversePreorder(TreeNode n){
		if (n != nullNode){
			System.out.print(n.getKey() + " ");
			traversePreorder(n.getLeft());
			traversePreorder(n.getRight());
		}
	}
	/**
	 * Recursively traverses the tree in Postorder priority which means first left, second right,
	 * third root.
	 * @param n
	 */
	public void traversePostorder(TreeNode n){
		if(n != nullNode){
			traversePostorder(n.getLeft());
			traversePostorder(n.getRight());
			System.out.print(n.getKey() + " ");
		}
	}
	
	/**
	 * Recursively traverses the tree in Levelorder priority which means traversing through every level
	 * of the tree in top down order from left to right
	 * @param q Array to take the tree values as a buffer
	 */
	public void traverseLevelorder(ArrayList<TreeNode> q){
		while(!q.isEmpty()){
			int level = 0;
			TreeNode n = q.remove(q.size()-1);
				
			
			if(n.getLeft()!= nullNode){
				q.add(0,n.getLeft());
				
			}
			if(n.getRight()!= nullNode){
				q.add(0,n.getRight());
				
			}
			
			
			
			System.out.print(" " + n.getKey() + " ");
			
		}
		
		
	}
	
}
