package w2prac;
import java.util.HashMap;
import java.util.Map;

public class JavaBeginner {
	//Q1:
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
	
	// Q3:
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
	
	//Q4:
	public static void wrapperConversions(String age, String salary, String active) {
		Integer ageInt = Integer.parseInt(age);
		Double salaryDouble = Double.parseDouble(salary);
		Boolean activeBoolean = Boolean.parseBoolean(active);
		double salaryInc = salaryDouble.doubleValue() * 1.1;
		
		System.out.println("ageInt (Integer): " + ageInt);
		System.out.println("salaryDouble (Double): " + salaryDouble);
		System.out.println("activeBoolean (Boolean): " + activeBoolean);
		System.out.println("salaryInc (double): " + salaryInc);
	}
	
	//Q5: 
	public static boolean isAnagram(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		Map<Character, Integer> mA = new HashMap<>();
		Map<Character, Integer> mB = new HashMap<>();
		
		for (char ch : a.toLowerCase().toCharArray()) {
			mA.put(ch, mA.getOrDefault(ch, 0) + 1);
		}
		for (char ch : b.toLowerCase().toCharArray()) {
			mB.put(ch, mB.getOrDefault(ch, 0) + 1);
		}
		
		for (char ch : mA.keySet()) {
			if(! mA.get(ch).equals(mB.get(ch))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(12345));
		System.out.println(reverseNumber(908));
		countConsonantsandVowels("Programming");
		wrapperConversions("25", "45000.75", "true");
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("hello", "world"));
		System.out.println(isAnagram("", ""));
	}
	
	
}
