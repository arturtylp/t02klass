 public class Kehamassiindeks{
	double m, h;
	public Kehamassiindeks(double kaal, double pikkus){
		if(kaal<=0){throw new RuntimeException("Sobimatu kaal");}
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		m=kaal;
		h=pikkus;
	}
	public double indeks(){
		return Math.round(m/(h*h)*100)/100.00;
	}
	public String toString(){
		return "Inimese kaal: "+m+" kg, pikkus: "+h+" m, massiindeks: "+
		       indeks();
	}
}