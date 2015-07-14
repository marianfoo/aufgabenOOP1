import java.util.Scanner;


public class Stromkosten {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein:");
		double preis = sc.nextDouble();
		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein:");
		int stunden = sc.nextInt();
		double kosten = stunden * preis;
		System.out.println("Jahreskosten " + kosten + " Euro");
		
	}
}
