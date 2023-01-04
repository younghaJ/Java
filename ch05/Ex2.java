package ch05;

public class Ex2 {
	public static void main(String[] args) {
		// 다차원 배열 : n * for
		int arr[][] = new int [2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+j;
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
		
			
	}

}
