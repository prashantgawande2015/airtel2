package encapsulation_demo;

public class Employee {

private double empsal;
	
public void SET_SAL(double passsal)
{
	if(passsal>0)
	{
	this.empsal=passsal;
	}
	else
	{
		System.out.println("Salary connot be negative");
	}
		

	
}

public double getsal()
{
	return this.empsal;
}
}
