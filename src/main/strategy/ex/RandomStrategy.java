package main.strategy.ex;

import java.util.Random;

import main.strategy.Hand;
import main.strategy.Strategy;

public class RandomStrategy extends Strategy {

	@Override
	public Hand nextHand() {
		return Hand.getHand(new Random().nextInt(3));
	}

	@Override
	public void study(boolean win) {
		// NOP
	}
}
