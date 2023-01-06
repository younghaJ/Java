package ch06;

class Constructor1 extends Object{ //extends Object 생략되어있다.
	//생성자
	
	public Constructor1() { //디폴트 생성자 : 구현하지 않으면 JVM이 컴파일 시점에 제공, 생성자가 없는 클래스는 설계가 잘못 됐다
		System.out.println("생성자 호출");
	}
	
	public Constructor1(int i) { //한 클래스 내에 동일한 생성자가 있으면 안된다. 둘다 매개변수가 없는 디폴트 생성자
		System.out.println("매개변수 int 생성자 호출");
	}
	
	public Constructor1(String s) {
		System.out.println("매개변수 String 생성자 호출");
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		//생성자가 많이 존재하는 이유 : 객체가 생성되는 다양한 case때문
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(22);
		Constructor1 c3 = new Constructor1("22");
	}

}