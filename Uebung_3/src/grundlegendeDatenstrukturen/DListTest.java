package grundlegendeDatenstrukturen;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DListTest {

	DList dliste = new DList();

	@Test
	public void testIsEmpty(){
		assertEquals(true,dliste.isEmpty());
		
		dliste.addFirst(new Integer(1));
		
		assertEquals(false, dliste.isEmpty());
	}
	
	@Test
	public void testAddFirst() {
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(3,dliste.getFirst());
	}
	
	@Test
	public void testGetFirst(){
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(3, dliste.getFirst());
	}
	
	@Test
	public void testAddLast(){
		
		Integer element = new Integer(6);
		Integer element1 = new Integer(98);
		Integer element2 = new Integer(3);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(6, dliste.getLast());
	}
	
	@Test
	public void testGetLast(){
		
		Integer element = new Integer(56);
		Integer element1 = new Integer(8);
		Integer element2 = new Integer(3);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(56, dliste.getLast());
	}
	
	
	@Test 
	public void testRemoveFirst(){
		Integer element = new Integer(45);
		Integer element1 = new Integer(78);
		Integer element2 = new Integer(89);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(89, dliste.removeFirst());
		
	}
	
	@Test
	public void testRemoveLast(){
		
		Integer element = new Integer(45);
		Integer element1 = new Integer(78);
		Integer element2 = new Integer(89);
		
		dliste.addFirst(element);
		dliste.addFirst(element1);
		dliste.addFirst(element2);
		
		assertEquals(45, dliste.removeLast());
	}

}
