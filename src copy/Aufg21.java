
public class Aufg21 {
	public static void main(String[] args) {
		int a = 7;
		int b = 21;
		int ergebnis = a + b;
		int ergebnis1 = b - a;
		int ergebnis2 = b * a;
		int ergebnis3 = b / a;
		int ergebnis4 = b % a;
		System.out.println(ergebnis);
		System.out.println(ergebnis1);
		System.out.println(ergebnis2);
		System.out.println(ergebnis3);
		System.out.println(ergebnis4);
		
		byte i = 127; // ein byte bis max 127 oder -128 moeglich
		short l = 32767; // zwei byte bis max 32767 moeglich
		int o = 234243234; // vier byte moeglich, heute ueblich
		boolean p = false; // 1 bit, nur true oder false
		
		char c = 'c'; // character, einzelne Zeichen
		
		int r = 500;
		long h = 5000;
		byte q = 5;
		r = (int) h;
		System.out.println(q);
		System.out.println(r);
		
	}
}
