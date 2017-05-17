package rational_unbearbeitet;


public final class Rational implements Comparable {

    private final long zaehler;
    private final long nenner;

    public Rational(long number) {
        zaehler = number;
        nenner = 1;
    }

    public Rational(long numerator, long denominator)throws ArithmeticException {
        // TODO: Irgenwas stimmt nicht mit dem Vorzeichen und der Exception
    	if (denominator == 0){
        	throw new ArithmeticException("Divided by zero");
        }
        long g = gcd(numerator, denominator);
        
        numerator /=g ;
        denominator /= g;
        
        if(denominator < 0){
        	numerator *= (-1);
        	denominator *= (-1);
        }
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
    public Rational add(Rational other) {
    	long commonDen = this.denominator()*other.denominator();
    	//Die Brueche erweitern
    	long thisnum = this.numerator() * other.denominator();
    	long othernum = other.numerator() * this.denominator();
    	//die Zaehler addieren
    	long num = thisnum + othernum;
        return new Rational(num,commonDen);
    }

    public Rational subtract(Rational other) {
    	long commonDen = this.denominator()*other.denominator();
    	//Die Brueche erweitern
    	long thisnum = this.numerator() * other.denominator();
    	long othernum = other.numerator() * this.denominator();
    	//die Zaehler subtrahieren
    	long num = thisnum - othernum;
    	
        return new Rational(num, commonDen);
    }

    public Rational multiply(Rational other) {
    	 // TODO korrigieren.
    	//multipliziere die Zaehler beider Brueche
    	long multNum = this.numerator() * other.numerator();
    	//multipliziere die Nenner beider Brueche
    	long multDen = this.denominator() * other.denominator();
        return new Rational(multNum, multDen);
    }

    public Rational divide(Rational other) {
    	Rational inv = other.invert();
    	long num = this.numerator() * inv.numerator();
    	long den = this.denominator() * inv.denominator();
        // TODO korrigieren.
        return new Rational(num, den);
    }

    public Rational invert() {
        // TODO korrigieren.

        return new Rational(this.nenner, this.zaehler);
    }

    public long numerator() {
        return zaehler;
    }

    public long denominator() {
        return nenner;
    }

    public String toString() {
        // TODO korrigieren.
    	if(this.nenner == 1){
    		
    		return zaehler +"";
    	}else{
    		return zaehler + "/" + nenner;
    	}
    }

    public int compareTo(Object other) {
        // TODO korrigieren.
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

    public boolean equals(Object other) {
        if (! (other instanceof Rational)) return false;
        Rational r = (Rational) other;
        if ((this.numerator()== r.numerator())&& 
        	(this.denominator()==r.denominator())){
        	return true;
        }else{
        // TODO korrigieren.
        return false;
        }
    }

    public double doubleValue() {
        // TODO korrigieren.
    	double value = (double) this.zaehler / (double)this.nenner;
        return value;
    }
}