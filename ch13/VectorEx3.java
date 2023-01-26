package ch13;

import java.util.Vector;

public class VectorEx3 {
	public static void main(String[] args) {
		Vector vlist = new Vector(4,3);
		System.out.println(vlist.capacity());
		for (int i = 0; i < 10; i++) {
			vlist.add(i*10);
		}
		System.out.println(vlist.size());
		System.out.println(vlist.capacity());
		System.out.println("첫번째 요소" + vlist.firstElement());
		System.out.println("마지막 요소" + vlist.firstElement());
		System.out.println("두번째 요소" + vlist.elementAt(1));
		System.out.println(vlist.isEmpty());
		vlist.remove(2);
		System.out.println(vlist.size());
		System.out.println(vlist.capacity());
		vlist.trimToSize();
		if(vlist.contains(20)) {
			
		}
	}

}
