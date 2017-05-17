package grundlegendeDatenstrukturen;

public class DataStructureTest {

	public static void main (String [] args){
		
		
		Queue list = new Queue();
		for(int i = 0; i < 10; i++){
			 Integer d = (int)(Math.random()*100);
			 list.enter(d);
			 System.out.println("Added " + list.enqueued() + " to the end of Queue");
		}
	
		for(int i = 0; i < 10; i++){
			System.out.println("Removed " + list.leave() + " from the front of Queue");
			if(!list.isEmpty()){
				System.out.println(list.front() + " is now waiting to be dequeued!");
			}else{
				System.out.println("Elements dequeued. List is empty");
			}
		}		
	}
}
