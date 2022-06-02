//Write a Java program to copy one array list into another.  
package arraylistProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		System.out.println(list2);
		//After copying
		Collections.copy(list1, list2);
		System.out.println("After copying:");
		System.out.println(list1);
		System.out.println(list2);
		

	}

}
