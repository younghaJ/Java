package ch05;

public class q1 {

	public static void main(String[] args) {
		//문제1
		int arr2[][] = {{1,2},
				{3,4,5},
				{6},
				{1,2,3,4},
				{2,3,4}};
		
		int sum =0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum+=arr2[i][j];
			}
		}
		System.out.println("문제1 모든값의 합:"+sum);
		
		//문제2
				double arr3[][] = {{1.0},
			               {2.3,3.4},
			               {4.5,6.2,4.3},
			                {9.0}};
				double sum1=0;
				int num=0;
				
				for (int i = 0; i < arr3.length; i++) {
					
					for (int j = 0; j < arr3[i].length; j++) {
						sum1+=arr3[i][j];
						
						if(j==(arr3[i].length-1))
							num+=j+1;
					}
				}
				System.out.println("문제2 배열의 평균:"+sum1/num);

		
		
		
	}

}
