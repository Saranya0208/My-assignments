package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		for(int i =2; i<=100 ; i++) {
		for(int j=2; j<=i/2; j++) {
		if(i%j==0) {			
			flag = true ;	
			break;			
			}
		else
			flag = false;		
		}
		if (flag == false) {
			System.out.println("Prime" + " " + i);
		}
		else
			System.out.println("Non prime" +" "+ i);
			
		}

	}

}
