package ch04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		
		//if((a%10)%3==0) (a%10)에서 a가 0이나 10이면 안됨
		if((a%10 ==3)||(a%10 ==6)||(a%10 ==9)) {
			System.out.println("짝!");
		}
		else {
			System.out.println(a);
		}
	}

}