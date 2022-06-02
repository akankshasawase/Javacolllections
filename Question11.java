//Write a Java program to reverse elements in a array list.  
package arraylistProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		System.out.println("After reversing:");
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
