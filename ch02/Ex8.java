package ch02;

public class Ex8 {

	public static void main(String[] args) throws Exception {
			System.out.println("키보드 입력하고 Enter입력");
			while(true) {
				int KeyCode = System.in.read();
				System.out.println("KeyCode: "+ KeyCode);
			
				if(KeyCode==113) {
					break;
				}
			}
			System.out.println("종료");
		}
}