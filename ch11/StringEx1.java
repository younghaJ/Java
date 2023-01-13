package ch11;

class Point3{}

public class StringEx1 {

	public static void main(String[] args) {
		Point3 p1 = new Point3();
		Point3 p2 = new Point3();
		
		System.out.println(p1 == p2);
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		//new 연산자 없이 객체를 생성하는 유일한 클래스
		//new 없이 만들어진 String 객체를 String 저장소에 만들어짐
		//만들어지고 생성할때 동일한 문자열 값이 있으면 참조
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		//객체의 문자열 내용을 비교
		System.out.println("-------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(p1.equals(p2));
		
		System.out.println("-------------");
		String s5 = "apple";
		String s6 = "APPLE";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6)); //대소문자 무시하고 비교
	}

}
