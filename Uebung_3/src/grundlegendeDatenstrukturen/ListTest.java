package grundlegendeDatenstrukturen;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListTest {

	List liste = new List();
	

	@Test
	public void testIsEmpty(){
		assertEquals(true,liste.isEmpty());
		
		liste.addFirst(new Integer(1));
		
		assertEquals(false, liste.isEmpty());
	}
	
	@Test
	public void testAddFirst() {
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(3,liste.getFirst());
	}
	
	@Test
	public void testGetFirst(){
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(3, liste.getFirst());
	}
	
	@Test
	public void testAddLast(){
		
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(6, liste.getLast());
	}
	
	@Test
	public void testGetLast(){
		
		Integer element = new Integer(56);
		Integer element1 = new Integer(8);
		Integer element2 = new Integer(3);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(56, liste.getLast());
	}
	
	
	@Test 
	public void testRemoveFirst(){
		Integer element = new Integer(45);
		Integer element1 = new Integer(78);
		Integer element2 = new Integer(89);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(89, liste.removeFirst());
		
		assertEquals(78, liste.getFirst());
		
	}
	
	@Test
	public void testRemoveLast(){
		
		Integer element = new Integer(45);
		Integer element1 = new Integer(78);
		Integer element2 = new Integer(89);
		
		liste.addFirst(element);
		liste.addFirst(element1);
		liste.addFirst(element2);
		
		assertEquals(45, liste.removeLast());
		
		assertEquals(78, liste.getLast());
	}

	
}
