package ch04;

import java.util.TreeSet;

public class LottoLucky2 {
	public static void main(String[] args) {
		Object lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
	
	public static Object[] getLotto() {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for (int i = 0; tr.size() < 6; i++) {
			tr.add((int)(Math.random()*45)+1);
		}
		Object lotto[] = tr.toArray();
		return lotto;
	}

	//자료구조 : Collection 기능 (중복알아서 해줌)
}
