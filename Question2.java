//Write a Java program to iterate through all elements in a array list.  
package arraylistProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Question2 {

	public static void main(String[] args) {
		 ArrayList<String> colors1=new ArrayList<String>();
		 colors1.add("Red");
		 colors1.add("White");
		 colors1.add("Green");
		 colors1.add("Brown");
		 colors1.add("Purpule");
		 ListIterator<String> it = colors1.listIterator();
		 while(it.hasNext())
	     {
			 System.out.print(it.next() + ", ");
		 }
		

	}

}
