package grundlegendeDatenstrukturen;

/**
 * 
 * @author Patrick Seidel
 * Klasse zur Erstellung von Knoten
 */
public class Node {

	private Object element;
	private Node next;
	private Node previous;
	
	public Node(){
		setNext(null);
		
	}
	/**
	 * Konstruktor für die einfach verkettete Liste
	 * @param element übergebenes Objekt
	 * @param next Zeiger auf den nächsten Knoten. 
	 * Ist <code>null</code> wenn es sich um den letzten Knoten der Liste handelt.
	 */
	public Node(Object element, Node next){
		setElement(element);
		setNext(next);
	}
	/**
	 * Konstruktor für die doppelt verkettete Liste
	 * @param previous Zeiger auf den vorherigen Listenknoten
	 * @param element Inhalt des Knotens
	 * @param next Zeiger auf den 
	 */
	public Node(Node previous, Object element, Node next){
		setPrevious(previous);
		setElement(element);
		setNext(next);
	}
	
	
	public Object getElement(){
		return element;
	}
	
	public void setElement(Object element){
		this.element = element;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getPrevious(){
		return previous;
	}
	
	public void setPrevious(Node previous){
		this.previous = previous;
	}
}
