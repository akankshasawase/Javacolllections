// Write a Java program to join two array lists. 
package arraylistProgram;

import java.util.ArrayList;

public class Question15 {

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
		//Joining two array
		ArrayList<String>list3=new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println();

	}

}
