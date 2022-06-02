//Write a Java program to empty an array list. 
package arraylistProgram;

import java.util.ArrayList;

public class Question17 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		//After removing
		list1.removeAll(list1);
		System.out.println(list1);

	}

}
