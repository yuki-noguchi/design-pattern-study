package main.strategy;

import java.util.Random;

/**
 * 前回の勝負に勝っていたら今回も同じ手を出す
 * 
 * @author yuki
 */
public class WinningStrategy extends Strategy {

	private Hand previousHand = randomHand();

	private boolean won = false;

	@Override
	public Hand nextHand() {
		if (!won) {
			return randomHand();
		}
		return previousHand;
	}

	@Override
	public void study(boolean win) {
		this.won = win;
	}

	private Hand randomHand() {
		return Hand.getHand(new Random().nextInt(3));
	}
}
