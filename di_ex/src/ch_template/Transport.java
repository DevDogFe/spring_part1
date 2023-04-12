package ch_template;

public abstract class Transport {

	public void startUp() {
		System.out.println("시동 걸기");
	}
	
	public abstract void drive();
	
}
