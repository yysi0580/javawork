package _04_HashMap;

import java.security.PrivateKey;

public class Snack {
	private String flavor;
	private int calory;
	
	public Snack() {
		
	}
	
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}


	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	
	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}
	
}
