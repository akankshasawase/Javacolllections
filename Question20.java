//Write a Java program to increase the size of an array list. 
package arraylistProgram;

import java.util.ArrayList;

public class Question20 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 System.out.println("Orignal arraylist:"+list1);
		 list1.ensureCapacity(5);
		 list1.add("Brown");
		 list1.add("Purpule");
		 System.out.println("After increasing capacity:"+list1);
		

	}

}
