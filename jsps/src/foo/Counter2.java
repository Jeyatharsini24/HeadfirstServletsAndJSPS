package foo;

public class Counter2
{
	private static int count;
	
	public static synchronized int getCount()
	{
		count++;
		return count;
	}
}