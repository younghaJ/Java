package ch04;

public class Ex9 {
	public static void main(String[] args) {
		//while문을 이용한 합
		int sum=0;
		int i=1;
		while(i<11) {
			sum+=i;
			i++;
		}
		System.out.println("sum = "+sum);
		
		while(true) {
			System.out.println("while문");
			if(true) {
				break;
			}
		}
		
		//do {
		//	System.out.println("do와일문");
		//} while (true);
		
		iot://라벨값: 구역의 시작 위치
		for(i=0; i<10; i++) {
			for(int j=0; j<10; j++)
				if((i+j)>30)
					break iot;
		}
		
		
	}

}
