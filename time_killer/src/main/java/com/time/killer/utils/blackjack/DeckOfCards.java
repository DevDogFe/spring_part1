package com.time.killer.utils.blackjack;


// 카드덱 클래스: 값이 세팅된 덱 하나 만드는 역할 
public class DeckOfCards {

	private int id;
	private Card[] cards;

	public int getId() {
		return id;
	}

	public Card[] getCards() {
		return cards;
	}

	// 카드 밸류 세팅
	public DeckOfCards(int id) {
		this.id = id;
		this.cards = new Card[52];
		String[] suits = { "s", "d", "h", "c" };
		String[] grade = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int k = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < grade.length; j++) {
				this.cards[k] = new Card(suits[i], grade[j], j + 1);
				if (j == 0) {
					this.cards[k].setValue(11);
					this.cards[k].setaValue(1);
				} else if (j > 9) {
					this.cards[k].setValue(10);
				}
				k++;
			}
		}
		for (int i = 0; i < cards.length; i++) {
			cards[0].setId(i);
		}
	}

}
