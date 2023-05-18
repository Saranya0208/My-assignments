package week3.day2.assgn;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1,4,3,7,8,5,6,3,10};
		Set<Integer> unique = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			unique.add(a[i]);
		}
		List<Integer> li = new ArrayList<Integer>(unique);
		for (int i = 0; i < li.size()-1; i++) {
			if((li.get(i) + 1) != (li.get(i+1))){
				System.out.println((li.get(i)+1));
				break;
		}	
			}
			
		
		}
}