package encapsulation_demo;

public class Test_employee {

	public static void main(String[] args) {
	Employee obj = new Employee();
	
//obj.empsal=-1000;
//System.out.println(obj.empsal);
obj.SET_SAL(10000);
System.out.println("Return salary is"+obj.getsal());

	}

}
