package trees;

import java.util.ArrayList;

public class BST {
	
	public static void main (String [] args){
		int [] intList = {35,28,52,7,19,65,59,44};
		//int [] intList = {8,7,6,5,4,3,2,1};
		//int [] intList = {1,2,3,4,5,6,7,8};
		BinaryTree bst = new BinaryTree();
		
		
		for(int i = 0; i < intList.length ; i++){
			Integer key = (int)(Math.random()*100);
			bst.insert(key);
			
		}
		System.out.println("Inorder Traversierung:");
		bst.traverseInorder(bst.getRoot());
		System.out.println("Min Element rekursiv: " + bst.findMinElementRecursively(bst.getRoot()));

		System.out.println("Preorder Traversierung: ");
		bst.traversePreorder(bst.getRoot());
		
		ArrayList queue = new ArrayList();
		queue.add(bst.getRoot());
		bst.traverseLevelorder(queue);
		
	}

}