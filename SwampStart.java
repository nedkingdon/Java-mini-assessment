package com.cognizant.swamp;

public class SwampStart {

	private int northSouth;
	private int eastWest;
	
	SwampStart(int northSouth, int eastWest ){
 
 this.setEastWest((int)(Math.random() * 100  -50));
this.setNorthSouth((int)(Math.random() * 100  -50));
	}

	public int getNorthSouth() {
		return northSouth;
	}

	public void setNorthSouth(int northSouth) {
		this.northSouth = northSouth;
	}

	public int getEastWest() {
		return eastWest;
	}

	public void setEastWest(int eastWest) {
		this.eastWest = eastWest;
	}
	
	
	
	
		
		
	}


