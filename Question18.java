//Write a Java program to test an array list is empty or not. 
package arraylistProgram;

import java.util.ArrayList;

public class Question18 {

	public static void main(String[] args) {
       ArrayList<String> myList = new ArrayList<String>();
		
		if(myList.isEmpty()) 
		{
			System.out.println("ArrayList is empty.");
		} 
		else 
		{
			System.out.println("ArrayList is not empty.");
		}
	}

}


