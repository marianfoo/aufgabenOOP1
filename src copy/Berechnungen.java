
public class Berechnungen {
	public static void main(String[] args) {
		int a; // Deklaration einer Variablen
		int b;
		int c;
		int plus;
		int minus;
		int mal;
		int durch;
		int modular;
		a = 6; // der Variable i wird ein Wert zugewiesen
		b = 225;
		c = 10;
		plus = a + b; // Die Variablen werden berechnet und dann einter weiter Variablen zugewiesen
		minus = b - a;
		mal = a * b;
		durch = a / b;
		modular = a % b;
		System.out.println(plus); // Die Variablen werden ausgedruckt
		System.out.println(minus);
		System.out.println(mal);
		System.out.println(durch);
		System.out.println(modular);
		System.out.println(c);
		while (c > a) { // solange c grosser ist als a wird while ausgefuhrt
			System.out.println("Text"); // "Text" wird gedruckt
			a++; // zu a wird eins hinzugefugt
		}
	}
}