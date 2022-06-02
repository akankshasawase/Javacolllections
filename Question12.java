//Write a Java program to extract a portion of a array list. 
package arraylistProgram;

import java.util.ArrayList;
import java.util.List;

public class Question12 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		List<String>sublist=list1.subList(0, 3);
		System.out.println("After extracting:"+sublist);

	}

}
