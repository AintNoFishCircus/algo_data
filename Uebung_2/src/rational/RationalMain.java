package rational;

public class RationalMain {
 
	public static void main(String [] args){
		Rational r = new Rational(1,3);
		Rational r2 = new Rational(1,3);
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r.equals(r2.invert()));
		
	}
}
