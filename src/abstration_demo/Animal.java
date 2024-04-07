package abstration_demo;

public abstract class Animal {
// non abstract method
	public void sleep()
	{
		System.out.println("All animal can sleep");
	}
	
	// abstract method.
	public abstract  void animalsound();
}
