package ch04;

import java.util.Iterator;

public class Ex11 {

	public static void main(String[] args) {
		//1~10사이의 짝수 출력
		int sum=0;
		for (int i = 1; i < 11; i++) {
			if(i%2==0) {
				System.out.println(i+"\t");
			}
		}
		System.out.println("\n---------------------");
		for (int i = 1; i < 11; i++) {
			if(i%2!=0) {
				continue; //for문을 직행. 즉 밑에 있는 코드 실행안됨.
			}
			System.out.println(i+"\t");
		}
		
		for (int i = 1; i < 21; i++) {
			if(i%3==0 && i!=18) {
				System.out.print(i + " + ");
				sum+=i;
				continue;
			}
			else if(i==18){
				sum+=i;
				System.out.println(i + " = " + sum);
			}
			else {
				continue;
			}
		}
			
			
			
		}

	}