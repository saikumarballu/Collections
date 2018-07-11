package SamplePrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0;
		int number = 749384834;
		while(number >1){
			rev = rev*10;
			rev = rev + number%10;
			number = number/10;
		}
		System.out.println(rev);

	}

}
