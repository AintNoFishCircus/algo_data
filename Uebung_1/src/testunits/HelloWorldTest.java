package testunits;
import uebung1.HelloWorld;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * Dieser Code wurde unter Zuhilfenahme der folgenden Quelle erstellt
 * http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
 * 
 * Kleines Testprogramm zur �berpr�fung des Inhalts des Ausgabestroms aus HelloWorld.java
 */
public class HelloWorldTest {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	/**
	 * Ausgabestrom in PrintStream umleiten um ihn mit dem erwarteten Wert vergleichen zu k�nnen
	 */
	@Before
	public void setUpStream(){
		System.setOut(new PrintStream(out));
		
	}

	/**
	 * Beseitigen der Umleitung
	 */
	@After
	public void cleanUpStreams(){
		System.setOut(null);
	}

	
	/**
	 * Vergleichen des umgeleiteten Ausgabestroms aus HelloWorld.java mit erwarteter Ausgabe
	 */
	@Test
	public void test(){
		String[] s = new String[]{""};
		HelloWorld.main(s);
		assertEquals("Hello World", out.toString());
	}

}
