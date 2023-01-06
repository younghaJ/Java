package ch06;

class Static3{
	static int a;
	int b;
	
}
public class StaticEx3 {
	public static void main(String[] args) {
		Static3 st1 = new Static3();
		Static3 st2 = new Static3();
		st1.b = 10;
		st2.b = 20;
		System.out.println(st1.b);
		System.out.println(st2.b);
		
		st1.a = 10;
		st2.a = 20;
		System.out.println(st1.a);
		System.out.println(st2.a);
	}
}
