import java.util.Scanner;


public class TestResult {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welche Punktzahl wurde erreicht?");
		int result = sc.nextInt();
		if(result >= 10)
			System.out.println("Der Test ist bestanden\n Ergebnis: Sehr gut");
		if(result == 9)
			System.out.println("Der Test ist bestanden\n Ergebnis: Gut");
		if(result == 8)
			System.out.println("Der Test ist bestanden\n Ergebnis: Befriedigend");
		if(result == 7)
			System.out.println("Der Test ist bestanden\n Ergebnis: Ausreichend");
		else 
			System.out.println("Ergebnis: Nicht ungenugend Punkte erreicht");
		
		
}
}