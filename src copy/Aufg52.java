import java.util.Scanner;

public class Aufg52 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Datum[] gebTag = new Datum[2];
		 
		 
		 for (int i=0; i<gebTag.length; i++){
			 gebTag[i] = new Datum();
		 }
		 for (int i=0; i<gebTag.length; i++){
			 System.out.print("Geben Sie die Namen hier ein  ");
			 gebTag[i].name = sc.next();
			 System.out.print("Geben Sie die Tag hier ein  ");
			 gebTag[i].tag = sc.nextByte();
			 System.out.print("Geben Sie die Monat hier ein  ");
			 gebTag[i].monat = sc.next();
			 System.out.print("Geben Sie die Jahr hier ein  ");
			 gebTag[i].jahr = sc.nextShort();
		 }
		 
		 for (int i=0; i<gebTag.length; i++){
			 System.out.println("Der Geburtstag von " + gebTag[i].name + " ist am " + gebTag[i].tag + "." + gebTag[i].monat + " im Jahr " + gebTag[i].jahr );
		 }
		 
		 
		
}
}