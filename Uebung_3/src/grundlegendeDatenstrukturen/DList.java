package grundlegendeDatenstrukturen;
public class DList {
	private Node head;
	private Node tail;
	
	public DList(){
		head= new Node();
		tail = new Node();
		head.setNext(tail);
		tail.setPrevious(head);
	}
	
	public boolean isEmpty(){
		if(head.getNext()==tail){
			return true;
		}else{
			return false;
		}
	}
	public void addFirst(Object o){
		Node n = new Node(head,o,head.getNext());
		head.getNext().setPrevious(n);
		head.setNext(n);
		
	}
	
	public Object getFirst(){
		return head.getNext().getElement();
	}
	
	public Object removeFirst(){
		Node temp = head.getNext();
		head.setNext(temp.getNext());
		temp.getNext().setPrevious(head);
		return temp.getElement();
	}
	
	public void addLast(Object o){
		Node n = new Node(tail.getPrevious(),o, tail);
		tail.getPrevious().setNext(n);
		tail.setPrevious(n);
	}
	
	public Object getLast(){
		return tail.getPrevious().getElement();
	}
	
	public Object removeLast(){
		Node temp = tail.getPrevious();
		tail.getPrevious().setNext(tail);
		tail.setPrevious(temp.getPrevious());
		return temp.getElement();
	}
}