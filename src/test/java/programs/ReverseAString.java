package programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		String word = "Bhoomika";
		String reversed = "";
		
		for(int i = word.length()-1; i >= 0; i--) {
			reversed = reversed + word.charAt(i) + " ";
		}
		
		System.out.println("Reversed string: " + reversed);

	}

}
