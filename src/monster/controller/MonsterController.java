package monster.controller;

//import java.util.Scanner;
//import java.util.Scanner;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController 
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}

	public void start() {
	}
	
	private void interactWithTheMonster1(MarshmallowMonster currentMonster) {
	}
	
	//helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sample + " is not");
		}
		
		return valid;
	}
	
		MarshmallowMonster sample = new MarshmallowMonster();
//		Systemout.println(sample);
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary", 8, 2, 3, true);
		
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		//System.out.println("Isaac is very hungry, so he will eat one tentacle");
		popup.displayText("Isaac is very hungry, so he will eat one tentacle");
		realMonster.setTentacleAmount(2);
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		void interactWithTheMonster1(realMonster);
		
		interactWithTheMonster1(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{	
		popup.displayText("Hey look at me!");
		String answer = popup.getResponse("How many meals are you going to eat?");
		System.out.println(answer);
		popup.displayText(answer);
		
		//System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + "wants to know what to eat next");		
		//System.out.println(currentMonster.getName() + " suggests arms they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + "suggests arms they have " + currentMonster);
		//System.out.println("How many do you want to eat?");
		//Scanner myScanner = new Scanner(System.in);
		int specialAnswer = Integer.parseInt(answer);
		String unconverted = popup.getResponse("How many do you want to eat");
		
		if(isValidInteger(unconverted))
		{
			specialAnswer = Integer.parseInt(unconverted);
		}
		
		//int consumed = myScanner.nextInt();
		//int difconsumed = myScanner.nextInt();
		
		//if(consumed< 0)
		{
			System.out.println("You cannot eat a negative number silly human");
		}
		//else if (consumed == 0)
		{
			System.out.println("why would you want to eat nothing dummy?");
		}
		//else if(consumed> currentMonster.getArmCount());
		{
			System.out.println("That is impossible - I only have " + currentMonster.getArmCount() + " arms!!!!");
		}
		// if(consumed< currentMonster.getArmCount())
		{
		//	currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only hae this many arms now. " +currentMonster.getArmCount());
		}
	{
		System.out.println(currentMonster.getName() + " suggests tentacles they have " + currentMonster.getTentacleAmount());
		System.out.println("How many do you want to eat?");
		
	}
		//if(consumed< 0) 
		{
			System.out.println("You cannot eat a negative number silly human");
		}
		//else if (consumed == 0)
		{
			System.out.println("Why would you want to eat nothing silly willy");
		}
		//else if(consumed> currentMonster.getTentacleAmount());
		{
			System.out.println("This is not possible - I only have " + currentMonster.getTentacleAmount());
		}
		//if(consumed< currentMonster.getTentacleAmount())
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount);
			currentMonster.setTentacleAmount("Thank you very much! I only have this many Tentacles now." +currentMonster.getArmCount);
		}}
		private boolean isValidDouble(String sampleDouble)
		{
			boolean valid = false;
			
			
		
		catch(NumberFormatException error):
		{
			String sampleDouble;
			popup.displayText("Only double values are valid: " + sampleDouble + " is not.");
			{
		
		Object valid;
		return valid;
	
				
		
		
	}
}}}

	
