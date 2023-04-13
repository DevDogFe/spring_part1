package com.time.killer.utils.blackjack;

// 딜러 클래스: 카드 덱 2개를 합쳐서 섞는 역할
public class Dealer {
	
	private DeckOfCards deck1;
	private DeckOfCards deck2;
	private Card[] cards = new Card[104];
	
	public DeckOfCards getDeck1() {
		return deck1;
	}

	public void setDeck1(DeckOfCards deck1) {
		this.deck1 = deck1;
	}

	public DeckOfCards getDeck2() {
		return deck2;
	}

	public void setDeck2(DeckOfCards deck2) {
		this.deck2 = deck2;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public Dealer() {
		deck1 = new DeckOfCards(1);
		deck2 = new DeckOfCards(2);
		for (int i = 0; i < deck1.getCards().length; i++) {
			cards[i] = deck1.getCards()[i];
		}
		for (int i = 0; i < deck2.getCards().length; i++) {
			cards[52 + i] = deck1.getCards()[i];
		}
	}
	
	private Card[] suffleCards() {
		int randomNum;
		int count = 0;
		Card[] suffledCard = new Card[104];
		boolean[] isDealed = new boolean[104];
		
		while(count < 104) {
			randomNum = (int)(Math.random()*104);
			if(isDealed[randomNum] == false) {
				isDealed[randomNum] = true;
				suffledCard[count] = cards[randomNum];
				count++;
			}
		}
		return suffledCard;
	}
	
}
