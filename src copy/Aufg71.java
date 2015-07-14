
 public class Aufg71 {
	 public static double bildeMittelwert(double feld[]){
			double temp = 0;
			for (int i=0; i<feld.length; i++ ){
				temp = temp + feld[i];
			}
			temp = temp / feld.length;
			return temp;
		}
		public static double minWert(double feld[]){
			double temp = 0;
			if (feld[0]>temp)
				temp = feld[0];
			for (int i=0; i<feld.length; i++){
				if (feld[i]<temp)
					temp = feld[i];
			}
			return temp;
		}
		public static double mmaxWert(double feld[]){
			double temp = 0;
			for (int i=0; i<feld.length; i++){
				if(feld[i]>temp)
					temp = feld[i];
				
			}
			return temp;
		}
		public static void druckeFeld(double feld[]){
			for (int i=0; i<feld.length; i++){
				System.out.print(feld[i] + " ");
			}
			System.out.println();
			System.out.println("Mittelwert: " + bildeMittelwert(feld));
			System.out.println("Groester Wert: " + mmaxWert(feld));
			System.out.println("Kleinster Wert: " + minWert(feld));
			
		}
	 public static void main(String args[]){
		double reihe[] = {10.0, 20.0, 30.0, 40.0, 50.0};
		druckeFeld(reihe);
	 }

 }