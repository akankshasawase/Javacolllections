//Write a Java program to insert an element into the array list at the first position.  
package arraylistProgram;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		 System.out.println("Before updating arraylist:");
		 System.out.println(list);
		 System.out.println("Inserting element at first position:");
		 list.add(0, "Pink");
		 System.out.println(list);
		 

	}

}
