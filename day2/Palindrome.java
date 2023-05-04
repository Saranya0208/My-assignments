package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {


		String str = "madam";
		String rev = "";
		char[] ch = str.toCharArray();

		for (int j = ch.length-1; j>=0; j--) {


			rev = rev + ch[j];

		}
		System.out.println(rev);

		if(str.equals(rev)) {
			System.out.println(str + " is a Palindrome");
		}
		else
			System.out.println(str + "is not a Palindrome");
	}
}
