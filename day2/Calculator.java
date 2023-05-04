package week1.day2;

public class Calculator {
	int sum = 0;
	int mul = 0;
	public int add(int a,int b,int c) {
		sum = a+b+c;
		return sum;
	}
	
	public int mul(int x,int y) {
		mul = x * y;
		return mul;
	}
	
	public void sub() {
		System.out.println("No Retruntype");
	}


	}


