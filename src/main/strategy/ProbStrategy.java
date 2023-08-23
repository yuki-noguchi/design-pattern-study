package main.strategy;

import java.util.Random;

/**
 * 基本はランダムだが、過去の勝ち負けの履歴を収集し、手を出す確率を変える
 * 
 * @author yuki
 */
public class ProbStrategy extends Strategy {

	private int previousHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = { //
			{ //
					1, // グー、グーの組み合わせ
					1, // グー、チョキの組み合わせ
					1, // グー、パーの組み合わせ
			}, //
			{ //
					1, // チョキ、グーの組み合わせ
					1, // チョキ、チョキの組み合わせ
					1, // チョキ、パーの組み合わせ
			}, //
			{ //
					1, // パー、グーの組み合わせ
					1, // パー、チョキの組み合わせ
					1, // パー、パーの組み合わせ
			}, };

	@Override
	public Hand nextHand() {
		int sum = 0;
		for (int i = 0; i < history.length; i++) {
			sum += history[currentHandValue][i];
		}

		int bet = new Random().nextInt(sum);

		int nextHandValue = 0;
		if (bet < history[currentHandValue][0]) {
			nextHandValue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			nextHandValue = 1;
		} else {
			nextHandValue = 2;
		}

		previousHandValue = currentHandValue;
		currentHandValue = nextHandValue;
		return Hand.getHand(nextHandValue);
	}

	@Override
	public void study(boolean win) {
		if (win) {
			history[previousHandValue][currentHandValue]++;
		} else {
			history[previousHandValue][(currentHandValue + 1) % 3]++;
			history[previousHandValue][(currentHandValue + 2) % 3]++;
		}
	}
}
