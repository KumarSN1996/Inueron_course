package Preethu;

import java.util.*;

public class GuesserGmae1 {
	public static void main(String[] args) {
		umpire u1 = new umpire();
		u1.takeFromGuesse();
		u1.takeFromPlayers();
		u1.compare();
	}
}

class Guesser {
	int guessnum;

	public int guess() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Guesser guess your number :");
		guessnum = s1.nextInt();

		if (guessnum >= 0 && guessnum <= 500) {
			System.out.println("Not a valid input, number is not in the range, guesser please guess number above 500 ");
			guessnum = s1.nextInt();
		} else
			System.out.println("Number is in the allowed range ");
		return guessnum;

	}

}

class player {
	int playguess;
	int playguess2;
	int playguess3;

	public int play() {

		Scanner s2 = new Scanner(System.in);
		System.out.println("Player 1 kindly guess the number:");
		playguess = s2.nextInt();

		if (playguess >= 0 && playguess <= 500) {
			System.out.println("Invalid entry,Player 1 kindly guess number 500 above");
			playguess = s2.nextInt();
		} else {
			System.out.println("Number is within the range,continue the game ");
			return playguess;
		}
		return 0;
	}

	public int playertwo() {
		Scanner s3 = new Scanner(System.in);
		System.out.println("Player 2 kindly guess your number:");
		playguess2 = s3.nextInt();
		if (playguess2 >= 0 && playguess2 <= 500) {
			System.out.println("Invalid entry,Player 2 kindly guess number 500 above");
			playguess2 = s3.nextInt();
		} else {
			System.out.println("Number is within the range,continue the game ");
			return playguess2;
		}
		return 0;
	}

	public int playerthree() {
		Scanner s4 = new Scanner(System.in);
		System.out.println("Player 3 kindly guess your number :");
		playguess3 = s4.nextInt();
		if (playguess3 >= 0 && playguess3 <= 500) {
			System.out.println("Invalid entry,Player 3 kindly guess number 500 above");
			playguess3 = s4.nextInt();
		} else {
			System.out.println("Number is within the range,continue the game ");
			return playguess3;
		}
		return 0;
	}
}

class umpire {
	int guessernum;
	int p1num;
	int p2num;
	int p3num;

	void takeFromGuesse() {
		Guesser g1 = new Guesser();
		guessernum = g1.guess();
	}

	void takeFromPlayers() {
		player p = new player();
		p1num = p.play();
		p2num = p.playertwo();
		p3num = p.playerthree();

	}

	void compare() {
		if (guessernum == p1num) {
			if (guessernum == p2num && guessernum == p3num) {
				System.out.println("All palyers 1,2 & 3 have guessed it correctly,game tied");
			} else if (guessernum == p2num) {
				System.out.println("Both players 1 and 2 have guessed correctly");
			} else if (guessernum == p3num) {
				System.out.println("Both players 1 and 3 have guessed correctlty ");
			} else {
				System.out.println("Only  player 1 have guessed correctly");
			}
		} else if (guessernum == p2num) {
			if (guessernum == p2num && guessernum == p3num) {
				System.out.println("Both player 2 and player 3 has won the game");
			} else {
				System.out.println("Player 2  has won the game");
			}
		} else if (guessernum == p3num) {
			System.out.println("Player 3 has won the game");
		} else {
			System.out.println("Game lost, no player has won the game correctly");
		}
	}

}
