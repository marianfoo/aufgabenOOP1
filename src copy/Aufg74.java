import java.util.Scanner;


public class Aufg74 {
	public final static String PW = "otto";
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int versuche = 3;
		int versuch = 1;
		for (int i = 0; i<versuche; i++){
			System.out.println("Bitte Passwort einlesen, " + versuch + ". Versuch");
			String password = sc.next();
			if (PW.equals(password)){
				System.out.println("WILLKOMMEN");
				i = 5;
				versuch = 4;
			}
			if (versuch == 3)
				System.out.println("Abbruch!!!!");
			versuch++;
		}
	}

}
