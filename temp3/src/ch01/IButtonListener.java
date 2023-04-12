package ch01;

/*
 * 옵저버패턴으로 설계하기 위해서는 인터페이스가 필요하다.
 * 인터페이스를 컴포지션(포함)관계로 선언한다.
 * */

public interface IButtonListener {
	
	void clickEvent(String event);

}
