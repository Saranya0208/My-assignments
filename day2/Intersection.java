package week1.day2;

import java.util.Iterator;

public class Intersection {
	public static void main(String[] args) {
		int[] arr  = {12,14,8,99,43,67};
		int[] arr1 = {35,68,14,72,99,12};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]){

					System.out.println(arr[i]);
				}
			}
		}
	}

}
