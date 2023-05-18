package week3.day2.assgn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.Get;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		String string = "";
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		Set<Character> unique = new TreeSet<Character>();
		Set<Character> duplicate = new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
			if(!add) {
				duplicate.add(charArray[i]);
			}
			unique.removeAll(duplicate);
		

		}
		List<Character> li = new ArrayList<Character>(unique);

		for (int i = 0; i < li.size(); i++) {
			string = string + String.valueOf(li.get(i));
		}
		String replaceAll = string.replaceAll(" ", "");
		System.out.println(replaceAll);
	}
}
