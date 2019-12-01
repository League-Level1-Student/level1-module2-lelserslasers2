package _01_getters_and_setters;

public class personMaker {

	public static void main(String[] args) {
		person guyOne = new person("joe", "flying");
		person guyTwo = new person("bob", "nothing");
		person guyThree = new person("rob", "magic");
		System.out.println(guyOne.toString());
		System.out.println(guyTwo.toString());
		System.out.println(guyThree.toString());
	}

}
