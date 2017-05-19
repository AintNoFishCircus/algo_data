package grundlegendeDatenstrukturen;
import grundlegendeDatenstrukturen.List;
/**
 * 
 * @author Patrick Seidel
 * Klasse zur Erstellung eines Stapelspeichers mithilfe einer einfach verketteten Liste
 */
public class Stack {
	/**
	 * Einfach verkettete Liste
	 */
	List stack;
	/**
	 * Erzeugt eine einfach verkettete Liste
	 */
	public Stack(){
		stack = new List();
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	/**
	 * Legt einen Knoten oben auf den Stapel
	 * @param o Das Inhalt des Knotens
	 */
	public void push(Object o){
		stack.addFirst(o);
	}
	/**
	 * Nimmt den obersten Knoten vom Stapel.
	 * @return Gibt den Inhalt des entfernten Knotens zurück.
	 */
	public Object pop(){
		return stack.removeFirst();
	}
	/**
	 * Gibt den Inhalt des obersten Knotens zurück.
	 * @return Inhalt des obersten Knotens.
	 */
	public Object peek(){
		return stack.getFirst();
	}
	
	
}
