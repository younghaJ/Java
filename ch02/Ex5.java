package ch02;

public class Ex5 {

	public static void main(String[] args) {
		//기본형 데이터의 형변환
		int a =10;
		long b = a; //묵시적 형변환
		short c = (short)a; //명시적 형변환, 더 작아질때
		
		a=32768;
		c = (short)a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
