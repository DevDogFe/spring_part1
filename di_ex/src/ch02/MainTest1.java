package ch02;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Base64;

public class MainTest1 {

	public static void main(String[] args) {

		// 중간클래스 만듬
		String url = "www.naver.com/books?id=100";
		
		Encoder encoder = new Encoder(new URLEncoder());
		
		String result1 = encoder.encode(url);
		System.out.println(result1);
		
		encoder.setiEncoder(new Base64Encoder());
		String result2 = encoder.encode(url);
		System.out.println(result2);
		
		encoder.setiEncoder(new MyEncoder());
		String result3 = encoder.encode(url);
		System.out.println(result3);
		
		try {
			System.out.println(URLDecoder.decode(result1, "UTF-8"));
			byte[] bytes = Base64.getDecoder().decode(result2.getBytes());
				System.out.println(new String(bytes));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	}
}
