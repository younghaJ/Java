package ch12;

class NoThreadEx1{

	String name;
	
	public NoThreadEx1(String name) {
		this.name = name;
	};
	
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
	
	public void start() {
		run();
	}
	
	public static void main(String[] args) {
		NoThreadEx1 n1 = new NoThreadEx1("First");
		NoThreadEx1 n2 = new NoThreadEx1("Second");
		n1.start();
		n2.start();
	}

}