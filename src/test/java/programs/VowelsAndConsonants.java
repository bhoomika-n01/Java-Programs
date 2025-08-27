package programs;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		//Count vowels and consonants in a string
		
		String word = "Bhoomika";
		int vowels = 0, consonants = 0;
		
		word = word.toLowerCase();
		
		for(int i = 0; i <word.length(); i++) {
			char ch = word.charAt(i);
			
		if (Character.isLetter(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		}
		
		System.out.println("vowels: " + vowels);
		System.out.println("consonants: " + consonants);

	}

}
