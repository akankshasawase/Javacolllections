//Write a Java program to print all the elements of a ArrayList using the position of the elements.
package arraylistProgram;

import java.util.ArrayList;

public class Question21 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		System.out.println("\nPrint using index of an element: ");
		  int no_of_elements = list1.size();
		  for (int index = 0; index < no_of_elements; index++)
		  {
		   System.out.println(list1.get(index));
		  }
		

	}

}
