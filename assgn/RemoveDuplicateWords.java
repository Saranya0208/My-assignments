package week3.day2.assgn;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");

		Set<String> unique = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			unique.add((split[i]));
		}
		List<String> li = new ArrayList<String>(unique);
		for (int i = 0; i < li.size(); i++) {
			System.out.print(li.get(i) + " ");;
			
		}
	}
}
