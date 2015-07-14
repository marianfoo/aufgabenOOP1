import java.util.Scanner;


public class Bestellung {
	public double preis;
	public String name;
	public int anzahl;
	
	final static double schraubenpreis = 0.05;
	final static double mutternpreis = 0.03;
	final static double scheibenpreis = 0.01;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Anzahl der Schrauben");
		int schrauben = sc.nextInt();
		System.out.println("Anzahl der Scheiben");
		int muttern = sc.nextInt();
		System.out.println("Anzahl der Unterlegsscheiben");
		int scheiben = sc.nextInt();
		
		if (schrauben > muttern)
			System.out.println("Kontrollieren Sie Ihre Bestellung!");
		else
			System.out.println("Die Bestellung ist okay.");
		
		double gesamtbetrag = schrauben * schraubenpreis + muttern * mutternpreis + scheiben + scheibenpreis;
		System.out.println("Gesamtbetrag: " + gesamtbetrag + "Euro");
	}
}
