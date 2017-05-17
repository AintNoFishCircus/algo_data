package grundlegendeDatenstrukturen;
import grundlegendeDatenstrukturen.List;

public class Stack {

	List stack;
	
	public Stack(){
		stack = new List();
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public void push(Object o){
		stack.addFirst(o);
	}
	
	public Object pop(){
		return stack.removeFirst();
	}
	
	public Object peek(){
		return stack.getFirst();
	}
	
	
}