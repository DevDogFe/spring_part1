package ch01;

public class Button {
	
	private String name;
	private IButtonListener iButtonListener;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void setIButtonLister(IButtonListener buttonListener) {
		this.iButtonListener = buttonListener;
	}
	
	// 콜백 메서드
	public void click(String message) {
		if(iButtonListener != null) {
			this.iButtonListener.clickEvent(message);
		}
	}
	
}
