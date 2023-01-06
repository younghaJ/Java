package ch06;

class Constructor2{
	//JVM은 생성자가 하나라도 생성되어 있으면 디폴트 생성자 제공 X.
	public Constructor2() {
			
	}
	public Constructor2(int i) {
		
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		Constructor2 c1 = new Constructor2();
		Constructor2 c2 = new Constructor2(27);
		
		//Dialog 클래스는 디폴트 생성자 존재 x
		
		//Dialog d = new Dialog();
	}

}
