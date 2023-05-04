//Odd Index to UpperCase
package week1.day2;

import java.util.Arrays;

public class OddIndex {

	public static void main(String[] args) {


		String strg = "Computer Program";
        String[] words = strg.split("");
        for (int i = 0; i < words.length; i++) {
			 if(i%2 == 0) {
				 System.out.print(words[i].toLowerCase());
			 }
			else
				 System.out.print(words[i].toUpperCase());
			
        }
	
}
}