package ch08;

abstract class TV{
	String color;
	boolean power;
	int ch;
	void powerOnOff() {
		power=!power;
	}
	void upCh() {
		ch++;
	}
	void downCh() {
		ch--;
	}
	
	abstract void setModel();
}

class SMTv extends TV implements RemoteControl{
	@Override
	void setModel() {
	}
	
	@Override
	public void turnOn() {
	}
	@Override
	public void turnOff() {
	}
	
}
class LGTv extends TV implements RemoteControl{
	@Override
	void setModel() {
	}
	@Override
	public void turnOn() {
	}
	@Override
	public void turnOff() {
	}
}
interface RemoteControl{
	void turnOn();
	void turnOff();
}
public class InterfaceEx4 {

}
