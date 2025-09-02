package programs;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//Reverse Array - String
		
		String a[] = {"B", "H", "O", "O", "M", "I"};
		System.out.println("Original array: " + Arrays.toString(a));
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
