package edu.ycp.cs320.Shopeze.controller;

import edu.ycp.cs320.Shopeze.model.ShopezeModel;

/**
 * Controller for the guessing game.
 */
public class ShopezeController {
	private ShopezeModel model;

	/**
	 * Set the model.
	 * 
	 * @param model the model to set
	 */
	public void setModel(ShopezeModel model) {
		this.model = model;
	}

	/**
	 * Start a new guessing game by setting the minimum to 1 and the maximum to 100.
	 */
	public void startGame() {
		model.setMin(1);
		model.setMax(100);
	}

	/**
	 * Called to indicate that the current guess is correct.
	 * Set the min and max to the current guess.
	 */
	public void setNumberFound() {
		model.setMin(model.getGuess());
		model.setMax(model.getGuess());
	}

	/**
	 * Called to indicate that the user is thinking of a number that
	 * is less than the current guess.
	 */
	public void setNumberIsLessThanGuess() {
		model.setMax(model.getGuess());
	}

	/**
	 * Called to indicate that the user is thinking of a number that
	 * is greater than the current guess.
	 */
	public void setNumberIsGreaterThanGuess() {
		model.setMin(model.getGuess());
	}
}
