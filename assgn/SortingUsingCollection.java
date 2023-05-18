package week3.day2.assgn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String str[] = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			li.add(str[i]);
		}
		Collections.sort(li);	
		for (int i = li.size()-1 ; i >= 0; i--) {
			System.out.print(li.get(i) + " ");
		}

	}

}
