package ch12;

public class ThreadEx1 extends Thread{

	String name;
	
	public ThreadEx1(String name) {
		this.name = name;
	};
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(20);
				System.out.println(name + " : " + i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1("ù��°");
		ThreadEx1 t2 = new ThreadEx1("ù��°");
		t1.start();
		t1.start();
	}

}
