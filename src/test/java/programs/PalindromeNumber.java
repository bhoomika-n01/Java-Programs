package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 1234321;
		int original = num;
		int res = 0;
		
		while(num != 0) {
			int digit = num % 10;
			res = res*10 + digit;
			num = num / 10;
		}
		
		if(original == res) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}

	}

}
