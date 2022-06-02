//Write a Java program to update specific array element by given element
package arraylistProgram;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		System.out.println(list);
		//Upadte specific element
		list.set(1, "Pink");
		System.out.println("After updating:");
		System.out.println(list);

	}

}
