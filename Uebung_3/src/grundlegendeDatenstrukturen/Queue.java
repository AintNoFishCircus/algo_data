package grundlegendeDatenstrukturen;
import grundlegendeDatenstrukturen.DList;

public class Queue{
	
	DList queue;
	
	public Queue(){
		queue = new DList();
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	public void enter(Object o){
		queue.addLast(o);
	}

	public Object leave(){
		return queue.removeFirst();
	}
	
	public Object front(){
		return queue.getFirst();
	}
	
	public Object enqueued(){
		return queue.getLast();
	}
	
}
