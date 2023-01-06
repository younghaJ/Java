package ch06;

class SuperClass4 {
	//super라는 키워드 부모를 지칭하는것
	//super()는 반드시 첫번째 라인에 삽입(생략)
//	public SuperClass4() {
//	 
//	}
	

	public SuperClass4(int i) {

	}
}

class SubClass4 extends SuperClass4 {
	public SubClass4() {
		// super(); 생략: 반드시 생성자의 첫번째 라인
		super(22);
	}
}

public class Constructor4 {

	public static void main(String[] args) {
		SubClass3 s1 = new SubClass3();

	}
}
