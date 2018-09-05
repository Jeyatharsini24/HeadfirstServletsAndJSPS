package foo;

public class Person
{
	private String name;
	
	private Dog dog;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDog(Dog dog)
	{
		this.dog = dog;
	}
	
	public Dog getDog()
	{
		return dog;
	}
}