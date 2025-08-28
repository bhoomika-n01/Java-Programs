package programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 20;
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b);
		
		for(int i = 1; i <= num; i++) {
			int next = a + b;
			System.out.print(" " + next);
			a = b;
			b = next;
		}
		

	}

}
