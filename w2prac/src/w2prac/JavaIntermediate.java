package w2prac;

public class JavaIntermediate {
	
	//Q6:
	public static void swapArith() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b; // Should underflow again in the case of an overflow on a+b
		a = a - b;
	}
	public static void swapXor() {
		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
	
	// Q7:
	// 1. Output: 
	// 10
	// 100
	// 2. The primitive was passed by value, not by reference
	// 3. The array object was passed, and is a reference to data itself, so the original value was modified
	// 4. Nothing happens: It was passed the value of the reference, and can modify the original's values, but not the original reference itself.

	//Q8:
	public static String removeDuplicates(String original) {
		StringBuilder fixed = new StringBuilder();
		for(char ch : original.toCharArray()) {
			if(fixed.indexOf(String.valueOf(ch)) == -1) {
				fixed.append(ch);
			}
		}
		return fixed.toString();
	}
	
	//Q9:
	public static String nonRepeat(String s) {
		StringBuilder sb = new StringBuilder(s);
		while(sb.length() != 0) {
			char ch = sb.charAt(0);
			if(sb.length() == 1) {
				return String.valueOf(ch);
			}
			else {
				if(sb.substring(1).indexOf(ch) == -1) {
					return String.valueOf(ch);
				}
				else {
					sb = new StringBuilder(sb.toString().replace(String.valueOf(ch), ""));
				}
			}
		}
		return "No non-repeated character";
	}
	
	//Q10: 
	// Output: 
	// true (same item in string pool)
	// false (new allocated a new place in memory)
	// true (values are compared directly)
	// Java Programming (string builders ARE mutable)
	// Java (The StringBuilder's instance was modified, not the string pool string)
	
	// String immutability: Strings ion java cannot be directly modified in place
	//String Pool: Java keeps a pool of recently used strings for efficiency. New strings of the same value are pointed to the old instance of that value;
	// == compares reference, .equals() compares the value of that reference
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("racecar"));
		System.out.println(nonRepeat("swiss"));
		System.out.println(nonRepeat("aabbcc"));
	}

}
