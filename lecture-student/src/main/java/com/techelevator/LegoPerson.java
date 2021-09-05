package com.techelevator;

public class LegoPerson {

	private String occupation;
	private String clotingColor;
	private boolean hasHat;
	
	
	public LegoPerson() {}
	
	public LegoPerson(String occupation, String clothingColor, boolean hasHat) {
		this.occupation = occupation;
		this.clotingColor = clothingColor;
		this.hasHat = hasHat;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getClotingColor() {
		return clotingColor;
	}

	public void setClotingColor(String clotingColor) {
		this.clotingColor = clotingColor;
	}

	public boolean isHasHat() {
		return hasHat;
	}

	public void setHasHat(boolean hasHat) {
		this.hasHat = hasHat;
	}
	
	
	
}
