package grundlegendeDatenstrukturen;

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
	 * @param next Zeiger auf den nächsten Knoten
	 */
	public Node(Object element, Node next){
		setElement(element);
		setNext(next);
	}
	
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
