package rational;

public final class Rational implements Comparable<Object> {
	
	
	
    private final long zaehler;
    private final long nenner;

    /**
     * Konstruktor der Klasse Rational
     * @param number 
     */
    public Rational(long number) {
        zaehler = number;
        nenner = 1;
       
    }
    /**
     * Konstruktor der Klasse Rational. Ermittelt direkt den größten gemeinsamen
     * Teiler von Zaehler und Nenner.
     * @param numerator Zaehler des Bruchs
     * @param denominator Nennet ds Bruchs
     * @throws ArithmeticException Löst eine Ausnahme aus wenn eine Division durch 0
     * festgstellt wird
     */
    public Rational(long numerator, long denominator) throws ArithmeticException {
        // TODO: Irgenwas stimmt nicht mit dem Vorzeichen und der Exception
    	//Prüfe ob Nenner = 0 ist und werfe in diesem Fall eine Exception
    	if(denominator == 0){
    		throw new ArithmeticException("Divided by 0");
    	}
        long g = gcd(numerator, denominator);
        numerator /=g ;
        denominator /= g;
        //Prüfe ob Nenner nun < 0 ist     
       if(denominator < 0){
    	   numerator *=(-1);
           denominator *= (-1);
       }
       //Zuweisung von Zaehler und Nenner
       this.zaehler = numerator;
       this.nenner = denominator;
     
        
    }
    
    /**
     * Berechnet den groessten gemeinsamen Teiler zweier positiver
     * Zahlen.
     * 
     * @param a 1. Zahl.
     * @param b 2. Zahl.
     * @return groesster gemeinsamer Teiler.
     */
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    /**
     * Addiert die Werte einer Instanz dieser Klasse mit einer weiteren Instanz
     * @param other Instanz von Rational
     * @return Summe 
     */
    public Rational add(Rational other) {
        // TODO korrigieren.
    	//gemeinsamen Nenner bestimmen
    	long commonDen = this.denominator()*other.denominator();
    	//Die Brueche erweitern
    	long thisnum = this.numerator() * other.denominator();
    	long othernum = other.numerator() * this.denominator();
    	//die Zaehler addieren
    	long num = thisnum + othernum;
        return new Rational(num,commonDen);
    }

    /**
     * Subtrahiert die Werte einer Instanz dieser Klasse von einer weiteren Instanz.
     * @param other Instanz von Rational
     * @return Differenz
     */
    public Rational subtract(Rational other) {
    	//gemeinsamen Nenner bestimmen
    	long commonDen = this.denominator()*other.denominator();
    	//Die Brueche erweitern
    	long thisnum = this.numerator() * other.denominator();
    	long othernum = other.numerator() * this.denominator();
    	//die Zaehler subtrahieren
    	long num = thisnum - othernum;
    	
        return new Rational(num, commonDen);
    }

    /**
     * Multipliziert eine Instanz dieser Klasse mit einer weiteren.
     * @param other Instanz von Rational
     * @return Produkt
     */
    public Rational multiply(Rational other) {
        // TODO korrigieren.
    	//multipliziere die Zaehler beider Brueche
    	long multNum = this.numerator() * other.numerator();
    	//multipliziere die Nenner beider Brueche
    	long multDen = this.denominator() * other.denominator();
        return new Rational(multNum, multDen);
    }

    /**
     * Dividiert eine Instanz von Rational durch eine weitere.
     * @param other Instanz von Rational
     * @return Quotient
     */
    public Rational divide(Rational other) {
    	Rational inv = other.invert();
    	long num = this.numerator() * inv.numerator();
    	long den = this.denominator() * inv.denominator();
        // TODO korrigieren.
        return new Rational(num, den);
    }
    /**
     * Inveriert Zaehler und Nenner 
     * @return Invertierter Bruch
     */
    public Rational invert(){
        // TODO korrigieren.
    
        return new Rational(this.nenner, this.zaehler);
    }

    /**
     * Zugriff auf das Attribut <code>numerator</code>
     * @return <code>numerator</code>
     */
    public long numerator() {
        return zaehler;
    }
    /**
     * Zugriff auf das Attribut <code>denominator</code>
     * @return <code>denominator</code>
     */
    public long denominator() {
        return nenner;
    }

   /**
    * Überschriebene Methode von Object.toString()
    */
    public String toString() {
        // TODO korrigieren.
    	if(this.nenner == 1){
    		
    		return zaehler +"";
    	}else{
    		return zaehler + "/" + nenner;
    	}
    }
    /**
     * Implementiert die Methode compareTo(Object o) des Interface Comparable
     */
    public int compareTo(Object other) {
    	// TODO korrigieren
    	double leftHandSide = this.doubleValue();
    	double rightHandSide = ((Rational) other).doubleValue();
    	if(leftHandSide < rightHandSide){
    		return -1;
    	}else if (leftHandSide > rightHandSide){
    		return 1;
    	}else{
    		return 0;
    	}
    }
    /**
     * Überschreibt Object.equals(Object o);
     */
    public boolean equals(Object other) {
    	//* Prüfe ob other eine Instanz der Klasse Rational ist
    	
        if (! (other instanceof Rational)) return false;
        Rational r = (Rational) other;
        // TODO korrigieren.
        if ((this.numerator()== r.numerator())&& 
            	(this.denominator()==r.denominator())){
            	return true;
            }else{
            // TODO korrigieren.
            return false;
            }
    }
    /**
     * Wandelt den Bruch in eine Dezimalzahl (double) um.
     * @return Rückgabe des Bruchs als Dezimalzahl
     */
    public double doubleValue() {
        // TODO korrigieren.
    	double value = (double) this.zaehler / (double)this.nenner;
        return value;
    }
}