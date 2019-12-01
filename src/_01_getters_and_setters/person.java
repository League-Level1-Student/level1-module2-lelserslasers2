package _01_getters_and_setters;

public class person {
	private String name;
	private String superpower;
	person(String name, String superpower){
		this.name = name;
		this.superpower = superpower;
	}
	public String getName() {
		return name;
	}
	
	public String getSuperpower() {
		return superpower;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	
	public String toString() {
		String output = getName() + " has mad " +  getSuperpower() + " skills.";
		return output;
	}
}
