package foo;

import java.util.*;

public class DiceRoller
{
	public static int rollDice(List<String> str)
	{
		return (int)((Math.random() * 6) + 1);
	}
}