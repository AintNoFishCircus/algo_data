package grundlegendeDatenstrukturen;

public class List {

	private Node head;
	
	/**
	 * leerer Konstruktor
	 */
	public List(){
		head = new Node();
	}
	
	
	/**
	 * Prüft ob die Liste mindestens einen Knoten enthält
	 * @return true wenn ein Knoten vorhanden ist, ansonsten false.
	 */
	public boolean isEmpty(){
		if(head.getNext()==null){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Fügt einen Knoten an den Anfang der Liste.
	 * @param o Objekt das als Element in die Liste übergeben wird.
	 */
	public void addFirst(Object o){
		Node n = new Node(o,head.getNext());
		head.setNext(n);
	}
	
	/**
	 * Gibt das Element des ersten Listenknotens aus.
	 * @return Das Objekt an der ersten Stelle der Liste.
	 */
	public Object getFirst(){
		return head.getNext().getElement();
	}
	
	/**
	 * Entfernt den ersten Knoten aus der Liste
	 * @return das entfernte Element
	 */
	public Object removeFirst(){
		Node temp = head.getNext();
		head.setNext(temp.getNext());
		return temp.getElement();
	}
	
	public void addLast(Object o){
		Node temp = head;
		while(temp.getNext()!=null){
			temp = temp.getNext();
			}
		Node n = new Node(o, temp.getNext());
		temp.setNext(n);
		
	}
	
	public Object getLast(){
		Node temp = head;
		while(temp.getNext()!=null){
				temp = temp.getNext();
			}	
		return temp.getElement();
	}
	
	public Object removeLast(){
		Node temp = head;
		while(temp.getNext().getNext()!= null){
			temp = temp.getNext();
		}
		Node n = temp.getNext();
		temp.setNext(n.getNext());
		return n.getElement();
	}
}
