//Write a Java program to remove the third element from a array list. 
package arraylistProgram;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		System.out.println(list);
		//remove third element
		list.remove(2);
		System.out.println("After removing:");
		System.out.println(list);

	}

}
