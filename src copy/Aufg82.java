
public class Aufg82 {
	private int nummer;
	private String vorname;
	private String nachname;
	private int alter;
	private boolean geschlecht; //true fuer maennlich
	private static int gesamtZahl = 0;
	public Aufg82 (int a, boolean g, String v, String n){
		alter = a;
		geschlecht = g;
		vorname = v;
		nachname = n;
		gesamtZahl++;
		nummer = gesamtZahl;
	}
	private String getGeschlecht (){ //wenn boolean maennlich true, wird maennlich zurueckgegeben
		if (this.geschlecht)
			return "maennlich";
			else
				return "weiblich";
	}
	public int getAlter(){
		return this.alter;
	}
	public void setAlter(int neuesAlter){
		this.alter = neuesAlter; 
	}
	public boolean getIstMaennlich(){
		return this.geschlecht;
	}
	public boolean aelterAls(int m){
		if (this.alter > m)
			return true;
		else
			return false;
	}
	public String toString(){
		return this.vorname + " " + this.nachname + " " + this.alter + " " +
			   this.getGeschlecht() + " " + Aufg82.gesamtZahl;
	}
	public static void main(String[] args){
		Aufg82 Mensch = new Aufg82(45, true, "Tom", "Miller");
		Mensch.setAlter(50);
		System.out.println(Mensch);
		System.out.println(Mensch.aelterAls(44));
		Aufg82 Mensch2 = new Aufg82(66, false, "Hellen", "Mirren");
		System.out.println(Mensch2);
		System.out.println(Mensch2.getIstMaennlich());
		Aufg82 Mensch3 = new Aufg82(34,true, "Mark", "Spencer");
		System.out.println(Mensch3);
		System.out.println(Mensch.vorname);
		
	}
	}
