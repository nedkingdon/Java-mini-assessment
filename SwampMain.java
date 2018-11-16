package com.cognizant.swamp;

import java.util.Scanner;

public class SwampMain {

	public static void main(String[] args) {

		
		PlayerPosition currentP1=new PlayerPosition((int)(Math.random() * 100  -50),(int)(Math.random() * 100  -50));
		TreasureStart treasure = new TreasureStart(0, 0);
		TurnDistance game = new TurnDistance(0);
		Bearing deg = new Bearing(0);

		System.out.println("Welcome to the swamp it's kind of swampy here :/");
		System.out.println("you reach into your pocket and find a magic compass");
		System.out.println("this will guide you to untold riches!");
		
		
		
		while (!(currentP1.getNorthSouthLocation()==treasure.getNorthSouthT()) && !(currentP1.getEastWestLocation() == treasure.getEastWestT())) {
		
			if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() <= 0 && currentP1.getEastWestLocation() - treasure.getEastWestT() <= 0) { //north east
				deg.setDegrees((90*Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT()))
						/(Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT())+Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT())));
			}
			else if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() < 0 && currentP1.getEastWestLocation() - treasure.getEastWestT() > 0) {
				deg.setDegrees((270*Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT()))
						/(Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT())+Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT())));
			}
			else if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() > 0 && currentP1.getEastWestLocation() - treasure.getEastWestT() < 0) {
				deg.setDegrees(((90*Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT()))+180*Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT()))
						/(Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT())+Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT())));
			}
			else if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() > 0 && currentP1.getEastWestLocation() - treasure.getEastWestT() > 0) {
				deg.setDegrees(((270*Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT()))+180*Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT()))
						/(Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT())+Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT())));
			}
			
			System.out.println("the treasure is at a bearing "+ deg.getDegrees()+" degrees to you ");
			
		if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() > 0) {
			System.out.println(
					"you are " + (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT()) + "m North of the treasure");
		} else if (currentP1.getNorthSouthLocation() - treasure.getNorthSouthT() < 0) {
			System.out.println("you are " + (Math.abs(currentP1.getNorthSouthLocation() - treasure.getNorthSouthT()))
					+ "m South of the treasure");
		} else {
			System.out.println("you are directly East or West of the treasure");

		}

		if (currentP1.getEastWestLocation() - treasure.getEastWestT() > 0) {
			System.out
					.println("you are " + (currentP1.getEastWestLocation() - treasure.getEastWestT()) + "m East of the treasure");
		}

		else if (currentP1.getEastWestLocation() - treasure.getEastWestT() < 0) {
			System.out.println(
					"you are " + Math.abs(currentP1.getEastWestLocation() - treasure.getEastWestT()) + "m West of the treasure");
		}

		else {
			System.out.println("you are directly North or South of the treasure");

		}
		
	System.out.println("you are " + Math.round(Math.sqrt(Math.pow((currentP1.getEastWestLocation()-treasure.getEastWestT()),2)+Math.pow((currentP1.getNorthSouthLocation()-treasure.getNorthSouthT()), 2)))+
			"m as the crow flies from the treasure!");
	
	///////////////////////////////////// entry///////////////////////////////////////////////////////////////////////////////
		for(;;) {
			System.out.println("Which direction would you like to go? (north/south/east/west): ");
		Scanner sc= new Scanner (System.in);
				String direction = sc.nextLine();
				
				
				
				if (direction.equals("north")) {
					currentP1.setNorthSouthLocation((currentP1.getNorthSouthLocation()+game.getDistance()));
					break;
				}
				
				else if (direction.equals("south")) {
					currentP1.setNorthSouthLocation((currentP1.getNorthSouthLocation()-game.getDistance()));
				break;
				}
				
				else if (direction.equals("east")) {
					currentP1.setEastWestLocation((currentP1.getEastWestLocation()+game.getDistance()));
				break;
				}
				
				else if (direction.equals("west")) {
					currentP1.setEastWestLocation((currentP1.getEastWestLocation()-game.getDistance()));
				break;
				}
				else {
					System.out.println("enter a proper direction!");
				}
		}
	for(;;) {
	System.out.println("How lucky are you feeling? (low/medium/high): ");
	Scanner sc= new Scanner (System.in);
				String risk = sc.nextLine();
	

	
				
				if (risk.equals("high")) {
		game.setDistance((int)(Math.random() * 40  -10));
		break;
	}
	else if (risk.equals("medium")) {
		game.setDistance((int)(Math.random() * 20  +0));
	break;
	}
	else if (risk.equals("low")) {
		game.setDistance( ((int)(Math.random() * 2  +3)));
	break;
	}
	else {
		System.out.println("Enter your luck properly this time!");
	}
	}
	
	if(game.getDistance()<0) {
		System.out.println("strong winds blow you backwards you travel " + game.getDistance()+"m");
	}
	System.out.println("you march onwards and travel " + game.getDistance()+"m");
	
	}
	System.out.println("you win! time to get up and go outside");
	}
		
}	

	
				
				
	
		
			
				
		

	
		
		
	

