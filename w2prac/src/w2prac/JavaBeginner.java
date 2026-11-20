package w2prac;

public class JavaBeginner {
	
	public static int reverseNumber(int n) {
		int reversed = 0;
		while (n != 0) {
			reversed = reversed * 10 + n % 10;
			n /= 10;
		}
		return reversed;
	}
	
	// Q2: 
	// 13 (implicit casting to double, then explicit casting to int)
	// 70 (implicit casting from char to int)
	// F (explicit casting from int to char)
	
	public static void countConsonantsandVowels(String s) {
		int vowels = 0;
		int consonants = 0;
		for (char c : s.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(12345));
		System.out.println(reverseNumber(908));
		countConsonantsandVowels("Programming");

	}

}
