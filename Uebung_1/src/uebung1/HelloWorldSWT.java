package uebung1;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {
	private Shell shell;

	public HelloWorldSWT(){
	 initializeGUI();
	}
	/**
	 * Deklariert und initialisiert die grafische Oberfläche
	 * Instanziierung eines Display und Shell Objekts
	 * Setzen von Layout Parametern
	 */
	public void initializeGUI(){
		Display display = new Display();
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
		shell.setBounds(200,300, 200, 200);
		Label label = new Label(shell,SWT.CENTER);
		label.setText("Hello World");	
		shell.open();
		
		 //Prüfen ob die Shell geschlossen ist
		while(!shell.isDisposed()){
			// Liest Ereignisse aus dem Event Queue des OS ein und übergibt sie an die Shell bzw. an die dadurch aufgerufene
			//Methode
			if(!display.readAndDispatch()){
				//wenn readAndDispatch false zurückgibt wird das Display in den Wartezustand gesetzt
				display.sleep();
			}
			
		}
		display.dispose();
	}
	/**
	 * Start der main Methode
	 * @param args
	 */
	public static void main (String[] args){
		HelloWorldSWT swt = new HelloWorldSWT();
		
		
		
	}
}
