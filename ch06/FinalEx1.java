package ch06;

//final(마지막) : 클래스, 필드(인스턴스변수), 메소드
//1.클래스 : sub 클래스가 없는 클래스
//2.변수 : 상수선언(필드, 매개변수, 지역변수)
//3.메소드 : 오버라이딩 불가

final class Final1{
	
}
//class Final2 extends Final1{}
class Final3{
	
	final int KIA = 1;
	//final int SK;
	int k;
	
	//public Final3() {
		//KIA = 2;
	//	System.out.println(k);
	//}
	
	public void prn(final int a) {
		//a = 10;
		final int b = 10; //지역변수
		//b=20;
		int c;
		//System.out.println(c);
	}
}

class Final4{
	void prn() {
		
	}
	final void prn2() {
		
	}
}

class Final5 extends Final4{
	//@Override
	//void prn1() {}
	//@Override
	//void prn1() {}
}
public class FinalEx1 {
	public static void main(String[] args) {
		
	}
}
