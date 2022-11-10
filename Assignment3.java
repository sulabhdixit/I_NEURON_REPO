package in.neuron.com.Assignment3;

import java.util.*;

public class GuesserGame {

	public static void main(String[] args) {

		Umpire U = new Umpire();
		U.collectCompare();

	}

}

class Guesser {
	int guessNum;

	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("GUESSER KINDLY GUESS THE NUMBER");
		guessNum = sc.nextInt();
		
		return guessNum;

	}

}

class Player {

	int[] playerNum() {
		System.out.println("ENTER THE NUMBER OF PLAYERS");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] players = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("PLAYER " + (i + 1) + " PLEASE GUESS THE NUMBER");
			players[i] = sc.nextInt();
		}
		return players;
	}

}

class Umpire {
	void collectCompare() {

		Guesser g = new Guesser();
		int guess = g.guessNum();
		Player p = new Player();
		int[] player = p.playerNum();
		int[] count = new int[player.length];
		for(int j=0;j<count.length;j++) {
			count[j]=-1;
		}
		int temp = 0;
		for (int i = 0; i < player.length; i++) {
			if (player[i] == guess) {
				count[i] = i+1;
				temp++;
			}

		}
		for (int i1 = 0; i1 < count.length; i1++) {
			if (count[i1]>-1 && temp == 1)  {
				System.out.println("PLAYER " + count[i1] + " IS THE WINNER");
				break;
			}
			if (count[i1]>-1&&temp>1) {
				System.out.println("THERE ARE MORE THAN ONE CORRECT GUESSES THEREFORE MATCH DRAWN");
				break;
			}

		}
		if (temp == 0) {
			System.out.println("THERE ARE NOT A SINGLE COORECT GUESS THEREFORE NO ONE IS WINNER");
		}

	}
}
