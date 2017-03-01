public class Proov{
	public static void main(String[] args){
		Kehamassiindeks inimene1=new Kehamassiindeks(53, 1.65);
		Kehamassiindeks inimene2=new Kehamassiindeks(87, 1.88);
		Kehamassiindeks inimene3=new Kehamassiindeks(120, 1.73);
		System.out.println(inimene1);
		System.out.println(inimene2);
		System.out.println(inimene3);
		System.out.println("");
		System.out.println("Info:");
		System.out.println("Tervisele ohtlik alakaal < 16");
		System.out.println("Alakaal	16 - 18.9");
		System.out.println("Normaalkaal	19 - 25");
		System.out.println("Ülekaal	25.1 - 30");
		System.out.println("Rasvumine 30.1 - 35");
		System.out.println("Tugev rasvumine 35.1 - 40");
		System.out.println("Tervisele ohtlik rasvumine > 40.1");
	}
}

/*

Inimese kaal: 53.0 kg, pikkus: 1.65 m, massiindeks: 19.47
Inimese kaal: 87.0 kg, pikkus: 1.88 m, massiindeks: 24.62
Inimese kaal: 120.0 kg, pikkus: 1.73 m, massiindeks: 40.09

Info:
Tervisele ohtlik alakaal < 16
Alakaal 16 - 18.9
Normaalkaal     19 - 25
Ülekaal 25.1 - 30
Rasvumine 30.1 - 35
Tugev rasvumine 35.1 - 40
Tervisele ohtlik rasvumine > 40.1

*/