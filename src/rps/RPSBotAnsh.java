
package rps;

import java.util.Random;

/**
 * The functions will be called in alternating order. First play() and then
 * getResult().
 *
 */
public class RPSBotAnsh {

	private boolean won;
	private char yourMove;
	private char theirMove;
	private int sameMove;
	private int draws;
	private int wins;
	private int losses;

	/**
	 * Returns one char representing rock, paper, or scissors
	 * 
	 * @return 'r', 'p', or 's'
	 */
	public char play() {
		Random rand = new Random();
		if (draws > 5 || theirMove == '\0' || !Character.isDefined(theirMove)) {
			// random return for fist move
			if (rand.nextDouble() > 0.666) {
				return 'r';
			} else if (rand.nextDouble() < 0.333) {
				return 'p';
			} else {
				return 's';
			}
		}

		if (sameMove >= 4) {
			return moveThatBeats(theirMove);
		}
		if (won) {
			return moveThatBeats(yourMove);
		} else {
			return theirMove;
		}
	}

	/**
	 * Gets the result of a match with another bot, so you can adapt.
	 */
	public void getResult(char yourMove, char theirMove) {
		if (this.theirMove == theirMove) {
			sameMove++;
		}
		this.yourMove = yourMove;
		this.theirMove = theirMove;
		if (moveThatBeats(yourMove) == theirMove) {
			won = false;
			losses++;
		} else if (moveThatBeats(theirMove) == yourMove) {
			won = true;
			wins++;
		} else {
			won = false;
			draws++;
		}

	}

	// returns the move that beats a move
	private char moveThatBeats(char moveToBeat) {
		switch (moveToBeat) {
			case 'r': {
				return 'p';
			}
			case 'p': {
				return 's';
			}
			case 's': {
				return 'r';
			}
			default:
				return 'r';
		}
	}
}