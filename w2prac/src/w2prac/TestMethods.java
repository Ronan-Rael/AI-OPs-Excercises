package w2prac;

public class TestMethods {
	
	public static int addition() {
		return 1 + 2;
	}
	
	//Method overloading
	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static int multiply() {
		return 2 * 3;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		if(b == 0) {
			System.out.println("Cannot divide by 0.");
			throw new IllegalArgumentException("Division by 0");
		}
		return a / b;
	}

	public static void main(String[] args) {
		
	}

}
