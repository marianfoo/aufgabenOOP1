
import Prog1Tools.IOTools;
public class Aufg22 {
	public static void main(String[] args) {
	/*	Beispiel aus der Folien
	 * int i;
		double d;
		char c;
		boolean b;
		// int-Eingabe mit Prompt
		i = IOTools.readInteger("i = ");
		// double-Eingabe mit Prompt
		d = IOTools.readDouble("d = ");
		// char-Eingabe mit Prompt
		c = IOTools.readChar("c = ");
		// boolean-Eingabe mit Prompt
		b = IOTools.readBoolean("b = ");
		// Testausgaben
		System.out.println("i = " + i); 
		System.out.println("d = " + d); 
		System.out.println("c = " + c); 
		System.out.println("b = " + b);  */
		int a,b,c,d,e,f,g;
		a = IOTools.readInteger("Erste Zahl = ");
		b = IOTools.readInteger("Zweite Zahl = ");
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println(a +  " + " + b + " = " + c);
		System.out.println(a +  " - " + b + " = " + d);
		System.out.println(a +  " * " + b + " = " + e);
		System.out.println(a +  " / " + b + " = " + f);
		System.out.println(a +  " % " + b + " = " + g);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
