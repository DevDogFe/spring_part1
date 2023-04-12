package ch02;

import java.io.UnsupportedEncodingException;

public class URLEncoder implements IEncoder{
	
	// 객체 생성 + 메서드 호출 --> 의존 주입 받는 형태로 변경
	
	
	// 중간클래스 만들기
	
	@Override
	public String encode(String message) {
		
		try {
			return java.net.URLEncoder.encode(message, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
