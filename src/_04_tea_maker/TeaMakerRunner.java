package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		Kettle ket = new Kettle();
		ket.boil();
		
		TeaBag tbag = new TeaBag("Green");
		Cup cup = new Cup();
		cup.makeTea(tbag, ket.getWater());
	}

}
