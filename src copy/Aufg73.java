
public class Aufg73 {
	public static double berechneKreisUmfang(double r){
		return 2 * Math.PI * r;
	}
	public static int foo(int n){
	    if (n < 1){
	        return 0;
	    } else { 
	        return 1 + foo(n / 10);
	    }
	}
	public static double berechneKreisFlaeche(double r){
		return Math.PI * Math.pow(r, 2);
	}
	public static void druckeKreis (int radius[]){
		int zahl = 1;
		for (int i=0; i<radius.length; i++){
			System.out.println(zahl + ". Kreis");
			zahl++;
			System.out.println("Radius: " + radius[i]);
			System.out.println("Umfang: "+ berechneKreisUmfang(radius[i]));
			System.out.println("Flaeche: " +  berechneKreisFlaeche(radius[i]));
			System.out.println();
		}
	}
	public static void main (String args[]){
		int radius[] = {3, 8,5};
		druckeKreis(radius);
		
	}

}
