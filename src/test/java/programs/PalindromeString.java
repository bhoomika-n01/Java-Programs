package programs;

public class PalindromeString {

	public static void main(String[] args) {
		

		String word = "level";
		String revWord = "";
		
		for(int i = word.length()-1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);
		}
			
		if(revWord.equals(word)){
			System.out.println(word + " is a palindrome");
		}else {
			System.out.println(word + " is not a palindrome");
		
		}
	}

}
