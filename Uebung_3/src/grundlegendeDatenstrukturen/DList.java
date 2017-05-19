package grundlegendeDatenstrukturen;
/**
 * 
 * @author Patrick Seidel
 *
 */
public class DList {
	private Node head;
	private Node tail;
	
	/**
	 * Konstruktor
	 */
	public DList(){
		head= new Node();
		tail = new Node();
		head.setNext(tail);
		tail.setPrevious(head);
	}
	
	/**
	 * Prüft ob die Liste leer ist.
	 * @return Gibt true zurück wenn head direkt auf tail zeigt.
	 */
	public boolean isEmpty(){
		if(head.getNext()==tail){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Fügt einen neuen Knoten an den Anfang der Liste an
	 * @param o Objekt das an den Knoten übergeben wird.
	 */
	public void addFirst(Object o){
		Node n = new Node(head,o,head.getNext());
		head.getNext().setPrevious(n);
		head.setNext(n);
		
	}
	/**
	 * Gibt den Inhalt des ersten Knoten aus der Liste zurück
	 * @return Das Objekt des ersten Knotens.
	 */
	public Object getFirst(){
		return head.getNext().getElement();
	}
	/**
	 * Löscht den ersten Knoten der Liste
	 * @return Der gelöschte Knoten
	 */
	public Object removeFirst(){
		Node temp = head.getNext();
		head.setNext(temp.getNext());
		temp.getNext().setPrevious(head);
		return temp.getElement();
	}
	
	/** 
	 * Fügt einen Knoten an das Ende der Liste.
	 * @param o Objekt das an Knoten übergeben wird.
	 */
	public void addLast(Object o){
		Node n = new Node(tail.getPrevious(),o, tail);
		tail.getPrevious().setNext(n);
		tail.setPrevious(n);
	}
	
	/**
	 * Gibt den letzten Knoten aus der Liste zurück.
	 * @return Den Inhalt des letzten Knotens.
	 */
	public Object getLast(){
		return tail.getPrevious().getElement();
	}
	
	/**
	 * Löscht den letzten Knoten der Liste.
	 * @return Der Wert des gelöschten Knotens.
	 */
	public Object removeLast(){
		Node temp = tail.getPrevious();
		tail.getPrevious().setNext(tail);
		tail.setPrevious(temp.getPrevious());
		return temp.getElement();
	}
}
