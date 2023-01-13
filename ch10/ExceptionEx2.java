package ch10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[0] = 10;
			arr[1] = 10;
			arr[2] = 10;
			arr[3] = 10;
			System.out.println("실행?");
		} catch (Exception e) {
			System.out.println("배열 예외");
		} finally { //예외에 관계없이 무조건 실행
			System.out.println("파이널리!");
		}
	}
}
