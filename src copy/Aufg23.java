import Prog1Tools.IOTools;
public class Aufg23 {
	public static void main(String[] args) {
		double a,b,c,d,e,f;
		a = IOTools.readDouble("Erste Zahl = ");
		b = IOTools.readDouble("Zweite Zahl = ");
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		System.out.println(a +  " + " + b + " = " + c);
		System.out.println(a +  " - " + b + " = " + d);
		System.out.println(a +  " * " + b + " = " + e);
		System.out.println(a +  " / " + b + " = " + f);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}
}
