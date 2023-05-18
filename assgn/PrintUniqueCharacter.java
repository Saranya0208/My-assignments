package week3.day2.assgn;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String str = "Saranya"; 
		String string = "";
		Set<Character> unique = new TreeSet<Character>();
		Set<Character> duplicte = new TreeSet<Character>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			boolean val = unique.add(charArray[i]);
			if(!val) {
				duplicte.add(charArray[i]);
			}
			unique.removeAll(duplicte);
			unique.toString();
		}
		List<Character> li = new ArrayList<Character>(unique);
		for (int i = 0; i < li.size(); i++) {
			//string = string +	li.get(i).toString();
			string = string + String.valueOf(li.get(i));
		}
		System.out.print(string);
	}
}


