package grundlegendeDatenstrukturen;
import grundlegendeDatenstrukturen.DList;

/**
 * 
 * @author Patrick Seidel
 * Klasse zur Erstellung der Datenstruktur Queue mithilfe einer <class>DList</class>
 */
public class Queue{
	/**
	 * Doppelt verkettete Liste
	 */
	DList queue;
	/**
	 * Erzeugt eine doppelt verkettete Liste
	 */
	public Queue(){
		queue = new DList();
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	/**
	 * Fügt einen Knoten an das Ende der Warteschlange an
	 * @param o Inhalt des Knotens.
	 */
	public void enter(Object o){
		queue.addLast(o);
	}

	/**
	 * Nimmt das Objekt an der ersten Stelle der Warteschlange heraus.
	 * @return
	 */
	public Object leave(){
		return queue.removeFirst();
	}
	
	/**
	 * Gibt das Objekt zurück welches als nächstes entfernt wird
	 * @return
	 */
	public Object front(){
		return queue.getFirst();
	}
	
	public Object enqueued(){
		return queue.getLast();
	}
	
}
