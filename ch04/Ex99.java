package ch04;

public class Ex99 {

	public static void main(String[] args) {
		for(int a=11; a<20; a++) {
			System.out.println(a + "단");
			for(int b=11; b<20; b++) {	
				System.out.print(a + "*" + b + "=" + (a*b) + " ");
			}
			System.out.println();
		}
	}
}