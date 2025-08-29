package programs;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 1532;
		int original = num;
		int arms = 0;
		
		while(num != 0) {
			int digit = num % 10;
			arms = arms + digit*digit*digit;
			num = num / 10;
		}
		
		if (original == arms) {
			System.out.println("is armstrong number");
		}else {
			System.out.println("is not armsstrong number");
		}
	}

}
