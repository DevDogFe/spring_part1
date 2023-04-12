package ch02;

public class Encoder {

	private IEncoder iEncoder;
	
	// DI 의존주입 설정
	public Encoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	public void setiEncoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}

	// 기능
	public String encode(String message) {
		return iEncoder.encode(message);
	}
}
