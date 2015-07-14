import java.util.Scanner;


public class Sterneoben {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Anfangszahl der Sterne");
		int zahl = sc.nextInt();
		String stern = "$";
		String result = "";
		for (int i = 0; i<zahl;i++){
			result = result + stern;
		}
		for (int i = 0; i<zahl;i++){
			System.out.println(result);
			result = result.substring(1);

		}
	}
}