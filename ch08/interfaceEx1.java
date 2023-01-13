package ch08;

interface Calc{
	void plus(int a, int b); //자동 추상 메소드
	
}

class Function implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

class Graphics implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}
public interface interfaceEx1 {

}
