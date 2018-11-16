package com.cognizant.swamp;

public class TreasureStart {

	private int northSouthT;
	private int eastWestT;
	
	TreasureStart(int northSouthT, int eastWestT ){
 
 this.eastWestT = (int)(Math.random() * 100  -50);
this.setNorthSouthT((int)(Math.random() * 100  -50));
	}

	public int getNorthSouthT() {
		return northSouthT;
	}

	public void setNorthSouthT(int northSouthT) {
		this.northSouthT = northSouthT;
	}

			

			public int getEastWestT() {
				return eastWestT;
			}

			public void setEastWestT(int eastWestT) {
				this.eastWestT = eastWestT;
			}
	
	
	
		
		
	}


