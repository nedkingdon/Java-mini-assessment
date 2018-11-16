package com.cognizant.swamp;

public class PlayerPosition {
	
private int northSouthLocation;
private int eastWestLocation;

PlayerPosition(int northSouthLocation, int eastWestLocation){
	this.setNorthSouthLocation(northSouthLocation);
	this.eastWestLocation=eastWestLocation;
}

public int getEastWestLocation() {
	return eastWestLocation;
}

public void setEastWestLocation(int eastWestLocation) {
	this.eastWestLocation = eastWestLocation;
}

public int getNorthSouthLocation() {
	return northSouthLocation;
}

public void setNorthSouthLocation(int northSouthLocation) {
	this.northSouthLocation = northSouthLocation;
}
}
