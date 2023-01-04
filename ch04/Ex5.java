package ch04;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오(1~100)");
		int s = sc.nextInt();
		System.out.println("학년를 입력하시오(1~4)");
		int g = sc.nextInt();
		
		if(g<4) {
			if(s>=60)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}
		
		else if(g==4) {
			if(s>=70)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}
	}
}