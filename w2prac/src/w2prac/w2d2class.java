package w2prac;

public class w2d2class {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int evens = 0;
		int odds = 0;
		for (int row = 0; row < matrix2.length; row++) {
			for(int col = 0; col < matrix2[row].length; col++) {
				if(row == col) {
					System.out.println(matrix2[row][col]);
				}
			}
		}
		System.out.println("Evens: " + evens);
		System.out.println("Odds: " + odds);
	}

}
