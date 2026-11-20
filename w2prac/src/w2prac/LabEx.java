package w2prac;

public class LabEx {
	public static void printProfile(String name, int age, double height, boolean student, char grade) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Student: " + student);
		System.out.println("Grade: " + grade);
	}
	
	public static double average(int a, int b, int c) {
		return (a + b + c) / 3.0;
		
	}
	
	public static boolean fitsInByte(int num) {
		return num >= -128 && num <= 127;
	}
	
	public static int addTexts(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
	public static Integer boxTwice(int num) {
		return Integer.valueOf(num * 2);
	}
	
	public static void describe(Integer n) {
		System.out.println("Binary: " + Integer.toBinaryString(n));
		System.out.println("Max: " + Integer.MAX_VALUE);
		System.out.println("Compare with 10.5: " + Double.compare(n, 10.56));
	}
	
	public static boolean sameValue(Integer a, Integer b) {
		return a.equals(b);
	}
	
	public static int truncate(double d) {
		return (int) d;
	}
	
	public static double widen(int i) {
		return i;
	}
	
	public static char shiftLetter(char c, int n) {
		return (char) (c + n);
	}
	
	public static void describeValue(int n) {
		System.out.println("int: " + n);
	}
	public static void describeValue(double n) {
		System.out.println("double: " + n);
	}
	public static void describeValue(String n) {
		System.out.println("String: " + n);
	}
	
	public static void tryChange(int n) {
		n = 99;
	}
	
	public static void appendBang(StringBuilder sb) {
		sb.append("!");
	}
	
	public static void replaceBuilder(StringBuilder sb) {
		sb = new StringBuilder("New");
	}
	
	public static void shout(String s) {
		s = s.toUpperCase();
	}
	
	public static void compareRefs() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
	
	public static int safeLength(String s) {
		if (s == null) {
			return -1;
		}
		return s.length();
	}
	
	public static String initials(String first, String last) {
		return (first.charAt(0) + "" + last.charAt(0)).toUpperCase();
	}
	
	public static String clean(String s) {
		return s.trim().toLowerCase();
	}
	
	public static boolean isPalindrome(String s) {
		String sl = s.toLowerCase();
		String reversed = new StringBuilder(sl).reverse().toString();
		return sl.equals(reversed);
	}
	
	public static String maskEmail(String email) {
		int atIndex = email.indexOf('@');
		if (atIndex <= 1) {
			return email; // Not enough characters to mask
		}
		String maskedPart = "*".repeat(atIndex - 1);
		return email.charAt(0) + maskedPart + email.substring(atIndex);
	}
	
	public static String buildCsv(String a, String b, String c) {
		StringBuilder sb = new StringBuilder();
		sb.append(a).append(",").append(b).append(",").append(c);
		return sb.toString();
	}
	
	public static String edit(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(0, "[");
		sb.append("]");
		sb.replace(7, 12, "Java");
		sb.deleteCharAt(6);
		return sb.toString();
	}
	
	public static long timeJoin(boolean useBuilder) {
		long startTime = System.nanoTime();
		if (useBuilder) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 20000; i++) {
				sb.append("x");
			}
		} else {
			String result = "";
			for (int i = 0; i < 20000; i++) {
				result += "x";
			}
		}
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	
	public static String safeAppend(StringBuffer sb, String s) {
		if (sb == null) {
			sb = new StringBuffer();
		}
		sb.append(s);
		return sb.toString();
	}
	
	public static String formatReceipt(String customer, int quantity, double unitPrice) {
		double total = quantity * unitPrice;
		return String.format("Customer: %s\nQty: %d | Price: %.2f\nTotal: %.2f (whole: %d)", customer, quantity, unitPrice, total, (int) total);
	}

	public static void main(String[] args) {
		printProfile("Asha", 21, 5.6, true, 'A');
		printProfile("Ravi", 30, 5.9, false, 'B');
		System.out.println();
		
		System.out.println(average(1, 2, 2));
		System.out.println();
		
		System.out.println(fitsInByte(127));
		System.out.println(fitsInByte(128));
		System.out.println(fitsInByte(-129));
		System.out.println();
		
		System.out.println(addTexts("12", "30"));
		System.out.println();
		
		int r = boxTwice(21);
		System.out.println(r);
		
		describe(10);
		System.out.println();
		
		Integer a = 127;
		Integer b = 127;
		System.out.println("127: equals=" + sameValue(a, b) + "\t" + "== " + (a == b));
		a = 1000;
		b = 1000;
		System.out.println("1000: equals=" + sameValue(a, b) + "\t" + "== " + (a == b));
		System.out.println();
		
		System.out.println(truncate(9.99));
		System.out.println(truncate(-9.99));
		System.out.println();
		
		System.out.println(widen(7));
		System.out.println();
		
		System.out.println(shiftLetter('a', 2));
		System.out.println();
		
		describeValue(5);
		describeValue(2.5);
		describeValue("hi");
		describeValue('A');
		describeValue(5L);
		System.out.println();
		
		int x = 1;
		tryChange(x);
		System.out.println("x = " + x);
		System.out.println();
		
		StringBuilder sb = new StringBuilder("Hi");
		appendBang(sb);
		System.out.println(sb);
		System.out.println();
		
		sb = new StringBuilder("Hi");
		replaceBuilder(sb);
		System.out.println(sb);
		System.out.println();
		
		String s = "java";
		shout(s);
		System.out.println(s);
		System.out.println();
		
		StringBuilder aS = new StringBuilder("cat");
		StringBuilder bS = aS;
		bS.append("s");
		System.out.println(a);
		
		compareRefs();
		System.out.println();
		
		System.out.println(safeLength(null));
		System.out.println(safeLength("Hello"));
		System.out.println();
		
		System.out.println(initials("ashu", "jauhari"));
		System.out.println();
		
		System.out.println(clean("  HeLLo  "));
		System.out.println();
		
		System.out.println(isPalindrome("Level"));
		System.out.println(isPalindrome("Java"));
		System.out.println();
		
		System.out.println(maskEmail("ahsa@mail.com"));
		System.out.println();
		
		System.out.println(buildCsv("a", "b", "c"));
		System.out.println();
		
		System.out.println(edit("Hello World"));
		System.out.println();
		
		System.out.println("String +=: " + timeJoin(false) + " ns");
		System.out.println("StringBuilder: " + timeJoin(true) + " ns");
		System.out.println();
		
		System.out.println(safeAppend(new StringBuffer("Hi"), " there"));
		System.out.println();
		
		System.out.println(formatReceipt("Asha", 3, 9.99));
		System.out.println(formatReceipt("Ravi", 2, 4.5));
	}

}
