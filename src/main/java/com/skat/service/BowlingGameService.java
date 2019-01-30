package com.skat.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.skat.business.CalculateScore;
import com.skat.clientimpl.SkatClient;
import com.skat.exceptions.GameException;
import com.skat.model.GamePoints;
import com.skat.model.GameScoreAndVerificationResult;
import com.skat.model.VerificationResult;

/**
 * REST endpoint for the bowlinggame service
 * url: http://localhost:8080/bowling-opgave/webapi/gamePoints
 * @author Saeed Rezaiyeh
 * @version 1.0
 *
 */

@Path("game")
public class BowlingGameService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public GameScoreAndVerificationResult gameStart() {
		System.out.println("==> New game...");
		VerificationResult verificationResult = new VerificationResult();
		// init gamePoints setup: calling skat-endpoint
		SkatClient skatClient = new SkatClient();
		GamePoints game = skatClient.getPoints();

		GameScoreAndVerificationResult gameScoreAndResult = new GameScoreAndVerificationResult();
		gameScoreAndResult.setGamePoints(game);
		
		// calculate scores for the gamePoints
		try {
			CalculateScore.calculate(game);
		} catch (GameException e) {
			verificationResult.setCode(e.getErrorCode());
			verificationResult.setSuccess(false);
			gameScoreAndResult.setVerificationResult(verificationResult);
			return gameScoreAndResult;
		}		
		
		
		try {
			verificationResult = skatClient.submitResult(game);
		} catch (GameException e) {
			verificationResult.setCode(e.getErrorCode());
			verificationResult.setSuccess(false);
		}		
		
		gameScoreAndResult.setVerificationResult(verificationResult);
		
		return gameScoreAndResult;
	}

}
