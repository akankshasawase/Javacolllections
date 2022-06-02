// Write a Java program to shuffle elements in a array list.  
package arraylistProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {

	public static void main(String[] args) {
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		System.out.println(list2);
		System.out.println("After shuffeling");
		Collections.shuffle(list2);
		System.out.println(list2);
		

	}

}
