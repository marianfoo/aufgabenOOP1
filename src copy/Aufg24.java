import Prog1Tools.IOTools;
public class Aufg24 {
	public static void main(String[] args) {
		final double PI = 3.141592; //Deklarierung der Zahl Pi
		double u, h, dboden, fboden, fmantel, fgesamt, v; // alle Variablen sind double
		u = IOTools.readDouble("Umfang der Dose = "); //Eingabe der Umfang der Dose
		h = IOTools.readDouble("Hoehe der Dose = "); // Eingabe der Hoehe der Dose
		dboden = u / PI; // Durchmesser des Boden istgleich Umfang geteilt durch Pi
		fboden = PI * Math.pow(dboden/2, 2); // Fläche des Boden ist Pi mal Radius (Durchmesser durch 2) im quadrat (Math.pow nimmt x hoch y
		fmantel = u * h; // Die Mantelfläche ist Umfang mal Höhe
		fgesamt = 2 * fboden + fmantel; //Die Gesamtfläche 
		v = fboden * h; // Das Volumen ist Fläche mal Höhe
		System.out.println("Der Durchmesser des Dosenboden betraegt = " + dboden);
		System.out.println("Die Flaeche des Dosenboden betraegt = " + fboden);
		System.out.println("Die Mantelflaeche betraegt = " + fmantel);
		System.out.println("Die Gesamtflaeche betraegt = " + fgesamt);
		System.out.println("Das Volumen der Dose betraegt = " + v);
		}
	}