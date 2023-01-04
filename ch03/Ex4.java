package ch03;

public class Ex4 {
	public static void main(String[] args) {
		int arr[] = new int [2];
		//System.out.println(arr[1]);
		//System.out.println((3>13) && (arr[2] == 0)); //&&는 앞에 조건이 false면 뒤에 조건을 보지 않는다. &는 본다.
		System.out.println((3>13) || (arr[1] == 0));
		System.out.println((3>13) ^ (arr[1] == 0)); //XOR 둘이 달라야 True
		System.out.println(!false); //NOT
	}
}