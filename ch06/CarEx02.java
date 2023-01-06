package ch06;

class Car2 {
	
	String name;
	int speed;
	int gear;
	
	void stop() {
		speed=0;
	}
}

public class CarEx02 {
	public static void main(String[] args) {
		int a = 10;
		int b = a+10;
		
		Car2 c1 = new Car2();
		
		String s = new String("asdfasdf");
		System.out.println(s.toUpperCase());
		
		Integer i = new Integer(32);
		String str = i.toBinaryString(32);
		
	}

}
