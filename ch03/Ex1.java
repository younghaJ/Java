package ch03;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();
			
			if(a%2==1) {
				System.out.println("홀수입니다.");
			}
			else 
				System.out.println("짝수입니다");
		}
		
	}
}