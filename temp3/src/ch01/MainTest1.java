package ch01;

public class MainTest1 {

	// observer pattern(a.k.a. 콜백 메서드)
	public static void main(String[] args) {

		Button button = new Button("button1");
		button.setIButtonLister(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println("콜백 들어옴 >>" + event);
				
			}
		});
		button.click("하이");
		button.click("이게 정말 콜백이야?");
		
		
		// 람다식으로
		Button button2 = new Button("button2");
		button2.setIButtonLister((event)->{
			System.out.println("콜백 메서드 발동>> " + event);
		});
		button2.click("하이");
		
		
	}// end of main
	
}// end of class
