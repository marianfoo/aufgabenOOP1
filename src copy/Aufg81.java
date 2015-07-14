
public class Aufg81 {
	private String name;
	private int alter;
	private static int startnummer;
	private int folgenummer;
	public Aufg81(String name, int alter){
		this.name = name;
		this.alter = alter;
		startnummer++;
		folgenummer = startnummer;
	}
	
	public static void main (String [] args){
		Aufg81 maier = new Aufg81("Maier", 68);
		//Spieler1.name = "Maier";
		//Spieler1.alter = 68;
		Aufg81 schmidt = new Aufg81("Schmidt", 45);
		//Spieler2.name = "Schmidt";
		//Spieler2.alter = 45;
		Aufg81 berger = new Aufg81("Berger", 36);
		//Spieler3.name = "Berger";
		//Spieler3.alter = 36;
		System.out.println(maier.name + ", " + maier.alter + " Startnummer: " + maier.folgenummer);
		System.out.println(schmidt.name + ", " + schmidt.alter + " Startnummer: " + schmidt.folgenummer);
		System.out.println(berger.name + ", " + berger.alter + " Startnummer: " + berger.folgenummer);
	}
}