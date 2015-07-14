import Prog1Tools.IOTools;
public class Aufg32 {
	public static void main(String[] args) {
			int x = 1; // Variable x wird mit eins deklariert
			while (x <= 100) { // FŸhre Schleife aus solange x kleinergleich 100 ist
				System.out.print(x + "\t"); //Drucke x mit einem Tabulator
				if (x%10 == 0) // wenn x durch 10 null ist
					System.out.println(); // dann wird eine neue Zeile eingefŸgt
				x++; // Die Schleife ist durch, jetzt x plus eins
			}
			int y = 1;
			for (int i=0;i<100;i++){ // solange i kleiner 100 ist fŸhre die Schleife aus, jedes mal plus eins
				System.out.print(y + "\t");
				if (y%10 == 0)
					System.out.println();
				y++;
			}
			int z = 1;
			do {
				System.out.print(z + "\t");
				if (z%10 == 0)
					System.out.println();
				z++;
			}
			while (z <= 100);
			
				
			/*
			 * 
			long a = IOTools.readLong("Die positive ganze Zahl: a =");
			System.out.print("Die Quersumme von " + a + " ist ");
			long qs = 0;
			do { // Header
				qs = qs + a % 10; // Bsp. 1234 Module Rest 4 - 123 Module Rest 3.......4+3+2+1
				a = a / 10;
			} while (a > 0);
			System.out.println(qs);
			int zahl = 1;
			for ( int i = 0; i<10;i++) {
				zahl++;
				System.out.println(zahl);
			}
		for(int i = 0; i < 100; i++) { // wenn i kleiner 100 i plus 1
			if(i == 74) break; // wenn i gleich 74 hoere hier auf
			if(i % 9 != 0) continue; // wenn i modulo 9 ungleich null mache hier weiter
			}
			int i = 0; // i ist gleich null
			while(true) { // Endlosschleife ?
			i++; // i plus 1
			int j = i * 30; // j istgleich i mal 30
			if(j == 1260) break; // wenn j istgleich 1260 stoppe hier
			if(i % 10 != 0) continue; // wenn i modulo 10 ist ungelich 10 mache hier weiter
			System.out.println(i); // drucke i */
	}
}
