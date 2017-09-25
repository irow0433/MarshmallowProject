package monster.model;

public class MarshmallowMonster 
{
	private static final double String = 0;
	//Declarat section for the data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	public String getArmCount;
	public String getTentacleAmount;
	public Object toString;
	
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
	
	public String getName()
	{ 
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setNaame(String name)
	{ 
		this.name =  name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(String string)
	{
		this.tentacleAmount = String;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Hi, I am a monster! My name is " + name + ", and I have " + eyeCount;
		description += " eyes and I have " + armCount + " arms and I have " + tentacleAmount + " tentacles ";
		description += " and my bloop existence is " + hasBloop;
				
		return description;
	}

	public void setTentacleAmount(int i) {
		// TODO Auto-generated method stub
		
	}
}

// In MarshamllowMonster gives all of the Monster parts a purpose annd allows them to work