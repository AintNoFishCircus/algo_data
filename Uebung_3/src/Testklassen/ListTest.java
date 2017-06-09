package Testklassen;
import grundlegendeDatenstrukturen.List;

public class ListTest {
	
	public static void main (String [] args){
		
		List liste = new List();
		
		/*
		 * Testen der Methode isEmpty()
		 */
		System.out.println("isEmpty() sollte true zurückliefern!");
		System.out.println(liste.isEmpty());
	
	/*
	 * Testen der Methoden addFirst(Object o) und getFirst();
	 */
		for (int i = 0; i < 10; i++){
			Integer randomElement = new Integer ((int)(Math.random()*100));
			liste.addFirst(randomElement);
			System.out.println("Erstes Element sollte " + randomElement + " sein.");
			for ( int j = i; j == i; j--){
				System.out.println("Und ist " + liste.getFirst()+ ".");
			}
		}
		
		/*
		 * Testen der Methode getLast() und removeLast()
		 */
		
		for (int i = 10; !liste.isEmpty(); i--){
			System.out.println("Letztes Element der Liste ist " + liste.getLast() + ".");
			int lastElement = (int) liste.removeLast();
			System.out.println("Letztes Element entfernt." + ": " + lastElement);
			
		}
		
	}
}
