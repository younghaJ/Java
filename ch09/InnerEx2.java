package ch09;

class Outer1{
	int a = 22;
	void p() {
		System.out.println("a" + a);
	}
	class Inner2{
		int b = 23;
		void p1() {
			p();
			System.out.println("a + b = " + (a+b));
		}
	}
}
public class InnerEx2 {

}
