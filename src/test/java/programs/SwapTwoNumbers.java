package programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		
		
		//method -1 - without temporary variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		//method - 2 - using temporary variable
		int c = 25;
		int d = 75;
		int temp;
		
		temp = c;
		c = d;
		d =temp;
		
		System.out.println(".................");
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}

}
