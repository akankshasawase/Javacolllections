//Write a Java program to search an element in a array list.  
package arraylistProgram;

import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		System.out.println(list);
		//Searching element "red"
		if (list.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }

	}

}
