package main.strategy;

public class Main {

	public static void main(String[] args) {
		Player taro = new Player("たろう", new WinningStrategy());
		Player hanako = new Player("はなこ", new ProbStrategy());

		for (int i = 0; i < 100; i++) {
			Hand taroHand = taro.nextHand();
			Hand hanakoHand = hanako.nextHand();

			if (taroHand.isStrongerThan(hanakoHand)) {
				taro.win();
				hanako.lose();
			} else if (hanakoHand.isStrongerThan(taroHand)) {
				hanako.win();
				taro.lose();
			} else {
				taro.even();
				hanako.even();
			}

			System.out.println(taro.toString());
			System.out.println(hanako.toString());
		}
	}
}
