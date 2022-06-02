//8. Write a Java program to sort a given array list. 
package arraylistProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("Red");
		 list.add("White");
		 list.add("Green");
		 list.add("Brown");
		 list.add("Purpule");
		System.out.println(list);
		//sorting elements
		Collections.sort(list);
		System.out.println("After sorting:"+list);

	}

}
