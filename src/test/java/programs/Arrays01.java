package programs;

public class Arrays01 {

	public static void main(String[] args) {
		//Min and Max in an array
		
		int a[] = {10, 20, 90, 40, 60};
		int max = a[0];
		int min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
