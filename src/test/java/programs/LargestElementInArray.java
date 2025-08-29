package programs;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int a[] = {5, 7, 34, 78, 46, 34, 9, 6, 45};
		int max = a[0];
		
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("largest number is " + max);
	
	
	
	}

}
