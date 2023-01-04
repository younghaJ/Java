package ch06;
//.java로 선언된 클래스만 public 사용가능
//클래스 : 객체를 만드는 틀

class Car1{
	String carName;
	int velocity;
	String carColor;
	
	//필드 : 객체의 속성 ()없음
	
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)
			velocity=0;
	}
	//메소드 : 객체의 기능 ()있음
}

public class CarEx01 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);
		String str = "오늘의 메뉴는 수구레";
		System.out.println(str.length());
		
		//객체 생성
		Car1 c1 = new Car1();
		c1.carName = "소나타";
		c1.carColor = "흰색";
		c1.speedUp();
		
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}	
}