//Write a Java program to clone an array list to another array list. 
package arraylistProgram;

import java.util.ArrayList;

public class Question16 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		 list1.add("Red");
		 list1.add("White");
		 list1.add("Green");
		 list1.add("Brown");
		 list1.add("Purpule");
		System.out.println(list1);
		//cloning array
		ArrayList<String>newlist=(ArrayList<String>)list1.clone();
		System.out.println(newlist);
		

	}

}
