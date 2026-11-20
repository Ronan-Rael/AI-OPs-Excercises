package w2prac;

public class TestMath {

	public static void main(String[] args) {
		int i = 19;
		int j = 12;
		i += 'j';
		System.out.println(i);
		
		System.out.println(i / (double) j);
		int x = i++;
		System.out.println(x);
		System.out.println(i);
		
		System.out.println(Math.pow(2, 4));
		System.out.println((int) (Math.random() * 6) + 1);
		System.out.println(Math.max(1,2));
	}

}
