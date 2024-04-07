package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> objlist = new ArrayList<String>();
		
		
	
		System.out.println("objlist.add(111)");
		objlist.add("abc");
		objlist.add("PQR");
	
		objlist.add("abc");
		objlist.add("LMN");
		
		
		System.out.println(objlist);
		System.out.println(objlist.size()); // To find the size of list
		
		System.out.println(objlist.contains("abc"));// to check the "abc" present in list
		System.out.println(objlist.remove("abc")); // to remove "abc" from list
		System.out.println(objlist); // to print the array list
		
		// printing element by using while loop
		System.out.println("Iterating through the list....by using While loop");
		
		Iterator<String> itr = objlist.iterator();
while(itr.hasNext())
{
	itr.next();
}
		// printing element throgh the for loop
		// using enhace for loop
		System.out.println("printing element through ENCHANCE for loop");
		
		for(String element: objlist)
		{
			System.out.println(element);
		}
		
		
		
	}

}
