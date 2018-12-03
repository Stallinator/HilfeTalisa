import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class SimplePrinter {

	public static void main(String[] args) throws IOException {
		File file = new File("out.txt");
		file.createNewFile();
		PrintWriter printer = new PrintWriter(new FileWriter(file), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte geben sie eine ganzzahlige Zahl(Integer) ein (max. 10Stellen");
		String rein = in.readLine();
		int eingabe = Integer.valueOf(rein);
		
		printer.printf("%d %n", eingabe); //1.zeile Standardformat
		
		printer.printf("%010d %n", eingabe); //2.Zeile 10 Stellen mit führenden Nullen
		
		printer.printf("%+-,10d %n", eingabe); //3. Zeile Vorzeichen + Tausendertrennzeichen maximal 20 Stellen
		System.out.println("Bitte geben sie eine Zahl mit Nachkommastellen ein");
		rein = in.readLine();
		double ein = Double.valueOf(rein);
		
		printer.printf("%f %n", ein); //4.Zeile Double Standard
		
		printer.printf("%+-10.2f %n", ein); //5.Zeile Vorzeichen und 2 Kommastellen
		
		printer.printf("%6.3E %n", ein);//6.Zeile Wissenschaftliche Schreibweise
		
		printer.printf(Locale.US, "%.3f %n", ein) ;//7.Zeile 3 Nachkommastellen und USA Format
		
		
		
		
		
	}
}
