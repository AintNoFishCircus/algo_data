
public class SomeClass implements Iface {

	private int a;
	private int b;
	
	public SomeClass(int a, int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public void doSomething() {
		System.out.println("I do something");
		
	}

	@Override
	public String doSomethingDifferent() {
		String s = "I do something different";
		return s;
	}

	@Override
	public int doSomethingWithTheseIntegers(int a ,int b) {
		a = this.a;
		b = this.b;
		int c = (int)(Math.random()*a) + b;
		System.out.println("Did something with these integers.");
		return c;
	}

}
