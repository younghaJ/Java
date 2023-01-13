package ch08;

interface Interface2{
	int a = 10;		//필드는 무조건 상수, 초기화를 해야함	static final
	//void prn() {}	//일반 메소드는 선언 불가
	void prn();
}

interface Interface2_1 extends Interface2{
	void prn1();
}
//인터페이스끼리 상속 가능
class Myclass3 implements Interface2_1{
	@Override
	public void prn() {
		
	}
	@Override
	public void prn1() {
		
	}
}
public interface interfaceEx2 {

}
