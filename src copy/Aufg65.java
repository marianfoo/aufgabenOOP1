import java.util.ArrayList;



public class Aufg65 {
	public static void main (String[] args) {
		ArrayList<Integer> gerade = new ArrayList<Integer>();
		
		for (int i=1; i<=50; i++){
			if (i % 2 == 1)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50; i++){
			if (i % 2 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50;i++){
			if (i % 3 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50;i++){
			if (i % 5 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50;i++){
			if (i % 6 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50;i++){
			if (i % 9 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		for (int i=1; i<=50;i++){
			if (i % 10 == 0)
				System.out.print(i + " ");
			if (i>= 50)
				System.out.println("");
		}
		
}
}