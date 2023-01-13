package ch11;

public class test {

	static final int MAX = 100000; 
	
	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다.
		 *   대칭수(palindrome)인 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
        */
		
		//문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			String s = Integer.toString(i);
			for (int j = 0; j < Math.sqrt(i); j++) {
				char c1 = s.charAt(j);
				char c2 = s.charAt(Math.sqrt(i)-j);
			}
			
			
		}
//		for (int i = 0; i < 100000; i++) {
//			String s = Integer.toString(i);
//			for (int j = 0; j < s.length(); j++) {
//				if(s.charAt(j) == s.charAt(s.length()-j)) {
//					sum += i;
//				}
//			} 
//		}
		//System.out.println(sum);
		//문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		
		//문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
	}

}
