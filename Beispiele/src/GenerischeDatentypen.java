import java.util.LinkedList;
public class GenerischeDatentypen {

	public static void main( String [] args){
		try{
		LinkedList stringList = new LinkedList();
		stringList.add(5); //Zuweisung m�glich
		stringList.add("Hello");//Zuweisung m�glich 
		stringList.add(new Object());//Zuweisung m�glich, l�sst sich aber nicht casten 
		
		//Ausgabe der Listenelemente von stringList
		for(int i = 0; i < stringList.size();i++){
			//Cast eforderlich da keine Typsicherheit
			String s = (String) stringList.get(i);
			System.out.println(s);
		}
		
		LinkedList<String> genericStringList = new LinkedList<String>();
		
		genericStringList.add(5); //Zuweisung nicht m�glich da Pr�fung zu Kompilationszeit 
		genericStringList.add("Hello");
		genericStringList.add(new Object());
		
		//
		for(int i = 1; i < stringList.size();i++){
			//Kein expiziter Cast notwendig da Typsicherheit durch Parametrisierung
			String s = genericStringList.get(i);
			System.out.println(s);
		}
		}catch(ClassCastException cce){
			System.out.println(cce.getMessage() + "sklfjldkdfj");
		}
	}
	
}
