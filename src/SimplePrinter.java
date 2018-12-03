import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SimplePrinter {

	public static void main(String[] args) throws IOException {
		File file = new File("out.txt");
		file.createNewFile();
		PrintWriter printer = new PrintWriter(new FileWriter(file));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte geben sie eine ganzzahlige Zahl ein");
		String rein = in.readLine();
		int eingabe = Integer.valueOf(rein);
		
		printer.printf("%d %n", eingabe);
		printer.flush();
		printer.printf("%010d %n", eingabe);
		//printer.flush();
		System.out.print(eingabe);
		
		
	}
}
