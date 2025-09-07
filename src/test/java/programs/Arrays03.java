package programs;


public class Arrays03 {

	public static void main(String[] args) {
		// Second Largest Number in an Array
		
		int a[] = {3, 4, 56, 23, 45, 54, 5, 62};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if(a[i] > secondLargest && a[i] != largest){
				secondLargest = a[i];
			}
		}
		System.out.println(secondLargest);
		

	}

}
