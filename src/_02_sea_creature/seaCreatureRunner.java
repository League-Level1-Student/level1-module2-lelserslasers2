package _02_sea_creature;

public class seaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongbob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		
		System.out.println(spongbob.getName());
		spongbob.eat();
		spongbob.laugh();
		
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();



	}

}
