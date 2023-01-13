package ch09;
//내부(중첩)클래스
//클래스 안에 선언 !
//클래스 안에 선언이지만 static 클래스 선언
//메소드 안에 클래스 선언
//메소드 안에 선언을 하고 선언과 동시 생성 익명클래스 !

Interface MyInter{
	void
}
class Outer1{
	class Inner1{
		
	}
	static class Inner2{
		
	}
	//메소드 안에 메소드 선언 불가
	void prn(){
		class Inner3{
			
		}
	}
}// ---class Inner1

public class innerEx1 {

	public static void main(String[] args) {

	}

}
