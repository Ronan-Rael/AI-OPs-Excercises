package w2prac;

public class LabPrac {
	public static double toFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	public static int percent(int part, int whole) {
		if (whole == 0) {
			throw new IllegalArgumentException("Whole cannot be zero");
		}
		return (int) ((double) part / whole * 100);
	}
	
	public static String describeInt(int n) {
		return n + " -> binary " + Integer.toBinaryString(n) + " hex " + Integer.toHexString(n) + " octal " + Integer.toOctalString(n);
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("inside: a=" + a + " b=" + b);
	}
	
	public static void addTitle(StringBuilder name) {
		name.insert(0, "Dr. ");
	}
	public static String addTitleToString(String name) {
		return "Dr. " + name;
	}
	
	public static String padLeft(String s, int width, char fill) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < width - s.length(); i++) {
			sb.append(fill);
		}
		sb.append(s);
		return sb.toString();
	}
	
	public static int roundHalfUp(double d) {
		return (int) (d + 0.5);
	}
	public static String joinWithDash(String s, int times) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; i++) {
			if (i > 0) {
				sb.append("-");
			}
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static int factorialInt(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static long factorialLong(int n) {
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int countVowels(String s) {
		int count = 0;
		String sl = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = sl.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static String summarize(String s) {
		return "Length: " + s.length() + " | Upper: " + s.toUpperCase() +" | Vowels: " + countVowels(s);
	}
	
	public static void main(String[] args) {
		System.out.println(toFahrenheit(0));
		System.out.println(toFahrenheit(37.5));
		System.out.println(toFahrenheit(-40));

		System.out.println(percent(45, 60));
		System.out.println(percent(1, 3));
		
		System.out.println(describeInt(255));
		System.out.println(describeInt(8));
		
		int x = 1, y = 2;
		swap(x, y);
		System.out.println("outside: x=" + x + " y=" + y);
		// They didn't change because java passes by value, so the swap method only swapped copies of the values, not the original variables.
		
		StringBuilder sb = new StringBuilder("Rao");
		addTitle(sb);
		System.out.println(sb);
		String s = "Rao";
		addTitleToString(s);   // result ignored
		System.out.println(s);
		System.out.println(addTitleToString(s));
		// Result ignored because strings are immutable, so the method returned a new string with the title added, but the original string was unchanged.
		
		System.out.println(padLeft("42", 5, '0'));
		System.out.println(padLeft("12345", 3, '0'));
		System.out.println(joinWithDash("ab", 3));
		System.out.println(joinWithDash("x", 1));
		
		System.out.println(roundHalfUp(2.5));
		System.out.println(roundHalfUp(2.4));
		System.out.println(roundHalfUp(7.0));
		
		System.out.println(factorialInt(5));
		System.out.println(factorialLong(5));
		System.out.println(factorialInt(13));
		System.out.println(factorialLong(13));
		System.out.println(factorialLong(20));
		// The int result of 13! is wrong because it exceeds the maximum value of an int (2,147,483,647) leading to an overflow. The long result is correct because it can hold larger values (up to 9,223,372,036,854,775,807).
		
		System.out.println(summarize("Hello World"));
		System.out.println(summarize("Sky"));
	}

}
