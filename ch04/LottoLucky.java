package ch04;

import java.util.Arrays;

public class LottoLucky {
	public static void main(String[] args) {
		int lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
	
	public static int[] getLotto() {
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
		}
		Arrays.sort(lotto); //오름차순 정렬
		
		for (int i=1; i<lotto.length; i++) {
			if(lotto[i] == lotto[i-1]) {
				lotto[i] = (int)(Math.random()*45)+1;
				Arrays.sort(lotto);
				i--;
				System.out.println("중복");
			}
		}
		 //오름차순 정렬
		
		return lotto;
	}
}