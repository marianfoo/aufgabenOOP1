import java.util.Scanner;


public class TestEvaluation {
	public static void main(String[] args){

		int fehler = 1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welche Punktzahl wurde erreicht?");
			int result = sc.nextInt();
			
		if (result >= 7 && result <= 10 ){
			System.out.println("Der Test ist bestanden");
			fehler = 1;
			}
			else if (result < 7 && result >=0) {
				System.out.println("Der Test ist nicht bestanden");
				fehler = 1;
			}
			else {
				System.out.println("FEHLER: Ungueltige Punktzahl. Versuchen Sie es erneut");
				fehler = 0;
				
			}
		}
		while (fehler ==0);
		
	}

}
