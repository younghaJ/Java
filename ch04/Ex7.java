package ch04;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=30; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합 :"+sum);
		sum();
		tsnsum();
	}
	
	static void sum() {
		int hsum=0;
		int jsum=0;
		for(int i=1; i<=30; i++) {
			if(i%2==1) {
				hsum+=i;	}
			else {
				jsum+=i;	}	
		}
		System.out.println("홀수의 합 :" + hsum);
		System.out.println("짝수의 합 :" + jsum);
	}
	
	static void tsnsum() {
		int tsnsum=0;
		for(int i=1; i<=50; i++) {
			if(i%10==3||i%10==6||i%10==9||i/10==3) {
				tsnsum+=i;
			}
		}
		System.out.println("369의 합 :" + tsnsum);
		
	}

}
