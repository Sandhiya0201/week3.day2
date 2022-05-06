package Week3.Day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		Set<String> set= new TreeSet<String>();
		set.add("5");
		set.add("2");
		set.add("8");
		set.add("6");
		set.add("4");
		set.add("7");
		List<String> list=new ArrayList<String>(set);
		System.out.println(set);
		String String=list.get(8);
		System.out.println(String);
	}
}

