package ch11;

public class WrapperEx2 {

	public static void main(String[] args) {
		char c1 = 'J';
		System.out.println(c1);
		if(Character.isLetter(c1)) {
			System.out.println(" : 문자입니다");
		}
		
		char c2 = 'a';
		
		System.out.println(c1);
		if(Character.isLetter(c1)) {
			System.out.println(" : 소문자입니다");
		}
		
		char c3 = '2';
		char c4 = ' ';
		
		System.out.println(c4);
		if(Character.isLetter(c4)) {
			System.out.println(" : 공백문자입니다");
		}

	}

}
