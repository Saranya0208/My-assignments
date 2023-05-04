package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a computer tester";
		int flag = 0;
		String word;
		String revword;
		String result = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if((i+1)%2 == 0) {	
				flag = 1;
				word = words[i];
			}
			else {
				flag = 0;
				word = words[i];
			}

			if(flag == 1) {
				revword = "";
				for (int j = word.length()-1; j >=0; j--) {
					revword = revword + word.charAt(j);
					result = revword;
				}
			}
			else if(flag == 0) {
				result = word;
			}

			System.out.print(result + " ");
		}
	}

}				
