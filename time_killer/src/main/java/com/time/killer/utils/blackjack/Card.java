package com.time.killer.utils.blackjack;

// 카드 클래스
public class Card {

	// 모양
	private String suit;
	// 숫자
	private String grade;
	// 실제 점수
	private int value;
	// A경우 두번째 점수
	private int aValue;
	// 식별 번호
	private int id;

	public Card(String suit, String grade) {
		this.suit = suit;
		this.grade = grade;
	}

	public Card(String suit, String grade, int value) {
		this.suit = suit;
		this.grade = grade;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public String getGrade() {
		return grade;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getaValue() {
		return aValue;
	}

	public void setaValue(int aValue) {
		this.aValue = aValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void showInfo() {
		System.out.print(suit + " " + grade + "  ");
	}

}
