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
	}

}
