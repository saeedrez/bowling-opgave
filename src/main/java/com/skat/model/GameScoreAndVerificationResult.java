/**
 * 
 */
package com.skat.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Contains gamePoints input + score calculated + verification result, for client consumption
 * @author Saeed Rezaiyeh
 * Version 1.0
 */
@XmlRootElement
public class GameScoreAndVerificationResult {

	GamePoints gamePoints;
	VerificationResult verificationResult;
	
	public GamePoints getGamePoints() {
		return gamePoints;
	}
	public void setGamePoints(GamePoints game) {
		this.gamePoints = game;
	}
	public VerificationResult getVerificationResult() {
		return verificationResult;
	}
	public void setVerificationResult(VerificationResult verificationResult) {
		this.verificationResult = verificationResult;
	}
	
	
}
