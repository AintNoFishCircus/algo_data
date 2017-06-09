package trees;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;




public class BinaryTreeTest extends TestCase  {
	BinaryTree bst = new BinaryTree();
	int[] testIntegerList = new int[]{35,28,52,7,19,65,59};
	
	@Before
	public void setUpBinaryTree(){	
	for(int i = 0; i < testIntegerList.length; i++){
		bst.insert(testIntegerList[i]);
	}
	}
	@Test
	public void testInsert(){
		
			assertEquals(true,bst.insert(44));
			
		
		
	}
	
	
	
	@Test
	public void testFindMinElementRecursively(){
		
		
		assertEquals(7,bst.findMinElementRecursively(bst.getRoot()));	
	}
	
	
	@Test
	public void testFindMinElementIterativ(){
		
	}
	

}