package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class Taco {
	private String meat;
	private String sauce;
	Taco(String meat, String sauce){
		this.meat = meat;
		this.sauce = sauce;
	}
	public String getMeat() {
		return meat;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
}