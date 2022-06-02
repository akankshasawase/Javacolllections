// Write a Java program to create a new array list, add some colors (string) and print out the collection.
package arraylistProgram;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		 for(String color:list)
		 {
			 System.out.println(color);
		 }
		 

	}

}
