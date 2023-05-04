package week1.day2;



public class SumOfDigitFromString {

	private static char[] charArray;
	private static char charAt;

	public static void main(String[] args) {
		String str = "Tes12Le79af65";
		int sum = 0;


		String replaceAll = str.replaceAll("\\D", "");
		char[] charArray = replaceAll.toCharArray();

		for(int i= 0; i<charArray.length; i++) {

			int a = Character.getNumericValue(charArray[i]);
			sum = sum + a;			
		}	

		System.out.println(sum);

	}
}