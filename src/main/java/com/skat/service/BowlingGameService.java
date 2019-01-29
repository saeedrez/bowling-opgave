package com.skat.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.skat.business.CalculateScore;
import com.skat.clientimpl.SkatClient;
import com.skat.model.GamePoints;
import com.skat.model.GameScoreAndVerificationResult;
import com.skat.model.VerificationResult;

// url: http://localhost:8080/bowling-opgave/webapi/gamePoints
/**
 * REST endpoint for the bowlinggame service
 * @author Saeed Rezaiyeh
 * @version 1.0
 *
 */

@Path("game")
public class BowlingGameService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public GameScoreAndVerificationResult gameStart() {
		System.out.println("==> gamePoints start");
		// init gamePoints setup: calling skat-endpoint
		SkatClient skatClient = new SkatClient();
		GamePoints game = skatClient.getPoints();
		
		// calculate scores for the gamePoints
		CalculateScore.calculate(game);
		
		VerificationResult verificationResult = skatClient.submitResult(game);
		
		GameScoreAndVerificationResult gameScoreAndResult = new GameScoreAndVerificationResult();
		gameScoreAndResult.setGamePoints(game);
		gameScoreAndResult.setVerificationResult(verificationResult);
		
		return gameScoreAndResult;
	}

}
