package programs;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		
		for (int i = 2; i < num/2; i++) {
			if(num % 2 == 0) {
				isPrime = false;
			}
		}
		
		System.out.println(isPrime? "is prime ": "is not prime");
	}

}
