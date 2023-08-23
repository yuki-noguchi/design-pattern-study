package main.strategy;

import java.util.List;

public enum Hand {

	ROCK("グー", 0), SCISSORS("チョキ", 1), PAPER("パー", 2),;

	private String name;
	private int handValue;

	private static List<Hand> hands = List.of(ROCK, SCISSORS, PAPER);

	private Hand(String name, int handValue) {
		this.name = name;
		this.handValue = handValue;
	}

	public static Hand getHand(int handValue) {
		return hands.get(handValue);
	}

	public boolean isStrongerThan(Hand other) {
		return fight(other) == 1;
	}

	public boolean isWeakerThan(Hand other) {
		return fight(other) == -1;
	}

	public int getHandValue() {
		return handValue;
	}

	// 0: 引き分け
	// 1: 勝ち
	// -1: 負け
	public int fight(Hand other) {
		if (this == other) {
			return 0;
		}
		if ((this.handValue + 1) % 3 == other.handValue) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return name;
	}
}
