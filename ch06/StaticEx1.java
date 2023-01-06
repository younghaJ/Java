package ch06;

class Static1{
	static int i = 0;
	int j = 0;
	
	static void prn1() {}
	void prn2() {}
	
	static class Inner{} //내부클래스 앞에는 static 올 수 있음
}

public class StaticEx1 {

	public static void main(String[] args) {
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i = new Integer(22);
		int c = i.parseInt("23");
		
		int d = Integer.parseInt("23");
		//반지름이 5인 원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);
	}

}
