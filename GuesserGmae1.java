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

		if (guessnum >=0 && guessnum<=500) {
			System.out.println("Not a valid input, number is not in the range ");
			guessnum = s1.nextInt();
		} else
			System.out.println("Number is in the allowed range ");
		return guessnum;
		 
	}    
}

class player {
	int playguess;

	public int play() {
		{
	        Scanner s2 =new Scanner(System.in);
	        System.out.println("Player kindly guess the number");
	        playguess=s2.nextInt();

	        if (playguess<=0 && playguess>=500)
	        {
	            System.out.println("Invalid Input,Please guess the number within the range of 500");
	            playguess = s2.nextInt();
	        }else {
	            System.out.println("Number is within the range ");
	            return playguess;
	        }
	        return 0;
	    }
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
		p2num = p.play();
		p3num = p.play();

	}

	void compare() {
		if (guessernum == p1num) {
			if (guessernum == p2num && guessernum == p3num) {
				System.out.println("All palyers have guessed correctly,game tied");
			} else if (guessernum == p2num) {
				System.out.println("both players one and two have guessed correctly");
			} else if (guessernum == p3num) {
				System.out.println("both players one and three have guessed correctlt ");
			} else {
				System.out.println("only one player have guessed correctly");
			}
		} else if (guessernum == p2num) {
			if (guessernum == p2num && guessernum == p3num) {
				System.out.println("both player 2 and player 3 has won the game");
			} else {
				System.out.println("only player two has won the game");
			}
		} else if (guessernum == p3num) {
			System.out.println("player 3 has won the game");
		} else {
			System.out.println("game lost, no player has won the game correctly");
		}
	}

}
