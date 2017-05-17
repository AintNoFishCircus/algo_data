package rational;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array aus mehreren Instanzen der Klasse Rational
		Rational [] rlist = new Rational[]{new Rational(-2,3), new Rational(3,2),
							new Rational(-3),new Rational(5,6),new Rational(2),new Rational(8,12)};
		
		//Ausgabe der Liste über Zaehlergesteuerte Schleife
		for (int i = 0; i < rlist.length; i++){
			System.out.print(rlist[i]);
			System.out.print(", ");
			
		}
		java.util.Arrays.sort(rlist);
		System.out.println("");
		
		//Ausgabe der Liste über java.util.List
		java.util.List<Rational> sortedRationalList = java.util.Arrays.asList(rlist);
		System.out.println("Sortiertes Array: " + sortedRationalList);
		
		Rational sum = new Rational(0);
		// Durchlaufe das gesamte Array
		for(int i = 0; i < rlist.length; i++){
			// Instanziiere einen neuen Bruch mit dem Wert des Bruchs an Index i
			Rational r = rlist[i];
			//Addiere den aktuellen Wert auf sum
			sum = sum.add(r);
			
		}
		//Konsolenausgabe der Summe als Dezimalzahl
		System.out.println("Die Summe aller Brueche ist: " + sum.doubleValue());
		
		Rational invertedSum = new Rational(0);
		//Durchlaufe das gesamte Array
		for(int i = 0; i < rlist.length; i++){
			//Invertiere den Bruch an Listenposition i
			Rational r = rlist[i].invert();
			invertedSum = invertedSum.add(r);
		}
		System.out.println("Die Summe aller Kehrwerte ist: " + invertedSum.doubleValue());
	}

}
