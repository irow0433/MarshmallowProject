package monster.model;

public class MarshmallowMonster 
{
	//Declarat section for the data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless we speccify values all data members
		//are a zero, false, or null
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Hi, I am a monster! My name is " + name + ", and I have " + eyeCount;
		description += " eyes and I have " + armCount + " arms and I have " + tentacleAmount + " tentacles ";
		description += " and my bloop existence is " + hasBloop;
				
		return description;
	}
}
