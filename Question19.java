//Write a Java program to trim the capacity of an array list the current list size.
package arraylistProgram;

import java.util.ArrayList;

public class Question19 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		//after trimming
		list1.trimToSize();
		System.out.println("After trimming size:"+list1);
	}

}
