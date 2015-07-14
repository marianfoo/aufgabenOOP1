
public class Aufg51 {
	 public static void main(String[] args) {
		 Datum peter, paul, anna;
		 peter = new Datum();
		 paul = new Datum();
		 anna = new Datum();
		 peter.tag = 22;
		 peter.monat = "Juli";
		 peter.jahr = 1995;
		 paul.tag = 30;
		 paul.monat = "Dezember";
		 paul.jahr = 1940;
		 anna.tag = 11;
		 anna.monat = "September";
		 
		 anna.jahr = 1999;
		 System.out.println("Peters Geburtsdatum: " + peter.tag + "." + peter.monat +  "." + peter.jahr);
		 System.out.println("Pauls Geburtsdatum: " + paul.tag + "." + paul.monat +  "." + paul.jahr);
		 System.out.println("Annas Geburtsdatum: " + anna.tag + "." + anna.monat +  "." + anna.jahr);
		 
		
}
}