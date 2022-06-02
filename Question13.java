// Write a Java program to compare two array lists. 
package arraylistProgram;

import java.util.ArrayList;

public class Question13 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		System.out.println(list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		System.out.println(list2);
		//After comparing two lists
		boolean value=list1.equals(list2);
		System.out.println(value);
		//Adding one more element to the list2
		list2.add("F");
		//Now comparing check the result
		boolean value1=list1.equals(list2);
		System.out.println(value1);
		

	}

}
