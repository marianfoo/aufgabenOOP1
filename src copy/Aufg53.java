import java.util.Scanner;


public class Aufg53 {
	public String name;
	public String strasse;
	public int hausnummer;
	public int postleitzahl;
	public String wohnort;
	public int nummer;
	public String email;
	public String telefon;
	 public static void main(String[] args) {
		 boolean fertig = false;
		 Scanner sc = new Scanner(System.in); //Anzahl der Adressen kann hier eingegeben werden
		 System.out.println("=============================== \nStart Programm Adressverwaltung\n===============================\nWie viele Adressen moechten Sie eingeben?");
		 int n = sc.nextInt();
		 
		 Aufg53[] adresse = new Aufg53[n];
		 for (int i=0; i<adresse.length; i++){
			 adresse[i] = new Aufg53();
		 }
		 
		 while(!fertig) { //while Schleife wird hier eršffnet
			 
			 System.out.println("================\nAdressverwaltung\n================\n"
			 		+ "1 = Adresseingabe\n2 = Adressausgabe\n3 = Programm beenden\nIhre Wahl:");
			 int auswahl = sc.nextInt(); //Programmwahl kann hier getroffen werden
			 
		 switch(auswahl) {
		 
		 case 1: // Adresse eingeben
		 //Adresse die bearbeitet werden mšchte kann hier eingegeben werden
			 System.out.println("Welche Adresse wollen Sie bearbeiten?"
			 		+ " (Sie koennen maximal " + n + ". Adressen eingeben)");
			 
			 int adresseindex = sc.nextInt()-1;
			 adresse[adresseindex].nummer = adresseindex+1;
			 
			 System.out.print("Geben Sie die Namen hier ein  ");
			 adresse[adresseindex].name = sc.next();
			 
			 System.out.print("Geben Sie die Strasse hier ein  ");
			 adresse[adresseindex].strasse = sc.next();
			 System.out.print("Geben Sie die Hausnummer hier ein  ");
			 adresse[adresseindex].hausnummer = sc.nextInt();
			 System.out.print("Geben Sie die PLZ hier ein  ");
			 adresse[adresseindex].postleitzahl = sc.nextInt();
			 System.out.print("Geben Sie die Wohnort hier ein  ");
			 adresse[adresseindex].wohnort = sc.next();
			 System.out.print("Geben Sie ihre Emailadresse hier ein  ");
			 adresse[adresseindex].email = sc.next();
			 System.out.print("Geben Sie ihre Telefonnummer hier ein  ");
			 adresse[adresseindex].telefon = sc.next();
			 

		 break;
		 case 2: // Adresse ausgeben
			 System.out.println("Welche Adressen wollen Sie ausgeben?\n "
			 		+ "0 = Alle Adressen ausgeben\n1 - x = Die eine Adresse ausgeben");
			 int ausdruck = sc.nextInt();
			 
			 if (ausdruck == 0){
				 
			 for (int i=0; i<adresse.length; i++){
				 
				 if (adresse[i].nummer != 0) System.out.println("Das ist die " + adresse[i].nummer + ". Adresse" );
				 if (adresse[i].name != null) System.out.println(adresse[i].name);
				 if (adresse[i].strasse != null) System.out.print(adresse[i].strasse + " ");
				 if (adresse[i].hausnummer != 0) System.out.println (adresse[i].hausnummer);
				 if (adresse[i].postleitzahl != 0) System.out.print(adresse[i].postleitzahl + " ");
				 if (adresse[i].wohnort != null) System.out.println(adresse[i].wohnort);
				 if (adresse[i].email != null) System.out.println(adresse[i].email);
				 if (adresse[i].telefon != null) System.out.println(adresse[i].telefon);
			 }
			 }
			 else {
				ausdruck = ausdruck -1;
				System.out.println(adresse[ausdruck].name);
				System.out.print(adresse[ausdruck].strasse + " ");
				System.out.println (adresse[ausdruck].hausnummer);
				System.out.print(adresse[ausdruck].postleitzahl + " ");
				System.out.println(adresse[ausdruck].wohnort);	
				System.out.println(adresse[ausdruck].email);
				System.out.println(adresse[ausdruck].telefon);
				 
			 }
		 //Anweisungen
		 break;
		 case 3: // Programm beenden
		 //Variable fertig auf true setzen
			 fertig = true;
			 System.out.println("Das Programm ist hiermit beendet");
		 break;
		 default: // Falsche Zahl eingegeben
			 System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 3 ein!");
		 //Fehlermeldung
		 }
}
	 }
}