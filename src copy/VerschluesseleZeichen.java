import java.util.Random;
import java.util.Scanner;


public class VerschluesseleZeichen {


	public static String codierung(String passwort){
		Random r = new Random();
		int abstand = r.nextInt(11-1) + 1;
		 char[] buffer = passwort.toCharArray();
		 for (int i=0; i<passwort.length();i++){
			 if (Character.isUpperCase(buffer[i])){
				char x = (char) (buffer[i] + abstand);
				if (x > 90)
					x = (char) (x - 26);
				if (x<65)
					x = (char) (x + 26);
				buffer[i] = x;
			 }
	
		 }
		 return new String(buffer);
	}
	public static int getAbstand (String passwort, String buffer){
		int abstand = 0;
		char[] ab1 = passwort.toCharArray();
		char[] ab2 = buffer.toCharArray();
		for (int i=0; i<passwort.length();i++){
			 if (Character.isUpperCase(ab1[i])){
				abstand = ab2[i]- ab1[i];
			 }
		}
		return abstand;
	}
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Geben Sie den zu verschluesselnden Text ein: ");
	 String passwort = sc.nextLine();
	 /*System.out.print("Geben Sie den Abstand ein: ");
	 int abstand = sc.nextInt();*/
	 String buffer = codierung(passwort);
	 System.out.println("Verschluesselter Text:" +  buffer);
	 System.out.println("Verschluesselt mit zufaelligen Abstand " + getAbstand(passwort, buffer));
 }
}


