package Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindInsertion {
	public static  void main(String[] args) {
		List<Integer>listList= new ArrayList<Integer>();
		listList.add(5);
		listList.add(4);
		listList.add(3);
		listList.add(8);
		listList.add(9);
		listList.add(6);
	System.out.println("list is: "+listList);
	    List<Integer> firstList= new ArrayList<Integer>();
	    firstList.add(3);
	    firstList.add(4);
	    firstList.add(5);
	    firstList.add(6);
	    firstList.add(8);
	    firstList.add(5);
	    System.out.println("firstList is: "+firstList);
	    listList.retainAll(firstList);
	    System.out.println("The common elements in both the list are : "+ listList);
	    
	    
	   }

}
