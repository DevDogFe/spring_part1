package com.time.killer.utils.blackjack;

import java.util.ArrayList;

// 블랙잭 게임 프로세스
public class BlackjackProc {
	
	Card[] cards;
	
	public BlackjackProc(Card[] cards) {
		this.cards = cards;
	}
	
	// 카드 한장씩 나눠주기
	public Card deal(int count) {
		
		return cards[count];
	}
	
	// 점수 확인하기
	public int checkBusted(ArrayList<Card> cards) {
		int sum = 0;
		for (Card card : cards) {
			sum += card.getaValue();
		}
		if(sum > 21) {
			
		}
		
		return sum;
	}
	
	

}
