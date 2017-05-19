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
	 * Pr�ft ob die Liste leer ist.
	 * @return Gibt true zur�ck wenn head direkt auf tail zeigt.
	 */
	public boolean isEmpty(){
		if(head.getNext()==tail){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * F�gt einen neuen Knoten an den Anfang der Liste an
	 * @param o Objekt das an den Knoten �bergeben wird.
	 */
	public void addFirst(Object o){
		Node n = new Node(head,o,head.getNext());
		head.getNext().setPrevious(n);
		head.setNext(n);
		
	}
	/**
	 * Gibt den Inhalt des ersten Knoten aus der Liste zur�ck
	 * @return Das Objekt des ersten Knotens.
	 */
	public Object getFirst(){
		return head.getNext().getElement();
	}
	/**
	 * L�scht den ersten Knoten der Liste
	 * @return Der gel�schte Knoten
	 */
	public Object removeFirst(){
		Node temp = head.getNext();
		head.setNext(temp.getNext());
		temp.getNext().setPrevious(head);
		return temp.getElement();
	}
	
	/** 
	 * F�gt einen Knoten an das Ende der Liste.
	 * @param o Objekt das an Knoten �bergeben wird.
	 */
	public void addLast(Object o){
		Node n = new Node(tail.getPrevious(),o, tail);
		tail.getPrevious().setNext(n);
		tail.setPrevious(n);
	}
	
	/**
	 * Gibt den letzten Knoten aus der Liste zur�ck.
	 * @return Den Inhalt des letzten Knotens.
	 */
	public Object getLast(){
		return tail.getPrevious().getElement();
	}
	
	/**
	 * L�scht den letzten Knoten der Liste.
	 * @return Der Wert des gel�schten Knotens.
	 */
	public Object removeLast(){
		Node temp = tail.getPrevious();
		tail.getPrevious().setNext(tail);
		tail.setPrevious(temp.getPrevious());
		return temp.getElement();
	}
}
