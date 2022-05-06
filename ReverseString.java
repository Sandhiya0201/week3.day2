package Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("morning");
		list.add("good");
		System.out.println("Revere string are:  ");
		for (int i = 0, j = list.size() - 1; i < j; i++)
        {
            list.add(i, list.remove(j));
        }
 
        System.out.println(list);
	
	}

}
