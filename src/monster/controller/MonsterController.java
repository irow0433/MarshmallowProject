package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary", 8, 1, 3.5, true);
	}

}
