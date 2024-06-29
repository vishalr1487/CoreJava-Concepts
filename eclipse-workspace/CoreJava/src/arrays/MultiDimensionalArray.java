package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];
		arr[0][0] = 9;
		arr[0][1] = 3;
		arr[0][2] = 5;

		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[1][2] = 5;

		arr[2][0] = 5;
		arr[2][1] = 6;
		arr[2][2] = 5;

//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();
		}

	}

}
