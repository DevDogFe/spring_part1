package com.time.killer.utils.hangman;

// 행맨 게임 프로세스
// checkWord 메서드중에 뭐쓸지 몰라서 둘다 일단 둠 이후 하나 삭제 예정
public class hangmanProc {

	private String word;
	
	public hangmanProc(String word) {
		this.word = word;
	}
	
	// 단어 객체로 생성해놓고 쓰는용
	public boolean[] checkWord(byte b) {
		byte[] spellings = word.getBytes();
		boolean[] check = new boolean[spellings.length];
		for (int i = 0; i < spellings.length; i++) {
			if(spellings[i] == b) {
				check[i] = true;
			}
		}
		return check;
	}
	
	// 단어 매개변수로 받는용
	public boolean[] checkWord(String word, byte b) {
		byte[] spellings = word.getBytes();
		boolean[] check = new boolean[spellings.length];
		for (int i = 0; i < spellings.length; i++) {
			if(spellings[i] == b) {
				check[i] = true;
			}
		}
		return check;
	}
	
}
