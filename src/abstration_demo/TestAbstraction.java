package abstration_demo;

public class TestAbstraction {

	public static void main(String[] args) {
		
Dog objdog = new Dog();
objdog.sleep();//acccessing non-abstract method
objdog.animalsound(); // accessing abstract method

// Create object of CAT class
Cat objcat = new Cat();
objcat.sleep(); // acccessing non-abstract method
objcat.animalsound(); // accessing absract method


		
		
	}

}
