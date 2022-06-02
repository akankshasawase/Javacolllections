//Write a Java program to retrieve an element (at a specified index) from a given array list.  
package arraylistProgram;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		System.out.println(list);
		//Retrive the first and fourth element
		System.out.println("Retrive first element:"+list.get(0));
		System.out.println("Retrive fourth element:"+list.get(3));
		
	}

}
