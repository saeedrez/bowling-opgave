package com.skat.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.skat.model.GamePoints;
import com.skat.utils.MockGamePoints;


/**
 * Unittests for the bowling frames score calculate function
 * @author Saeed Rezaiyeh
 * @version 1.0
 *
 */
public class CalculateScoreTest {

	@Test
	public void testCalculateAllStrikes() {
		
		GamePoints game = MockGamePoints.getMockGamePointsAllStrikes();
		CalculateScore.calculate(game);
		
		assertEquals(game.getPoints().get(0).getScore(), 30);
		assertEquals(game.getPoints().get(1).getScore(), 60);
		assertEquals(game.getPoints().get(game.getPoints().size()-2).getScore(), 270);
		
		assertEquals(game.getToken(), "8upVjKF7FV7GMqqBQsz0tXcqM2qMWgCO");
	}

	@Test
	public void testCalculateCombinationScores() {
		
		GamePoints game = MockGamePoints.getMockGamePoints6();
		CalculateScore.calculate(game);
		
		assertEquals(game.getPoints().get(1).getScore(), 18);
		assertEquals(game.getPoints().get(3).getScore(), 31);
		assertEquals(game.getPoints().get(game.getPoints().size()-1).getScore(), 51);
		
		assertEquals(game.getToken(), "xY6jt41bP9sFL2mt5iBMBYOGxEdHZeJ4");
	}

	@Test
	public void testCalculateMockData1() {
		
		GamePoints game = MockGamePoints.getMockGamePoints1();
		CalculateScore.calculate(game);
		
		assertEquals(game.getPoints().get(0).getScore(), 13);
		assertEquals(game.getPoints().get(3).getScore(), 42);
		assertEquals(game.getPoints().get(game.getPoints().size()-1).getScore(), 56);
		
		assertEquals(game.getToken(), "SZShRYFAzQLBwWrJwCih9JOaOoYx9mMa");
	}


	@Test(expected=RuntimeException.class)
	public void testRuntimeExceptionWrongNrOfPins() {
		GamePoints game = MockGamePoints.getMockInvalidGamePoints();
		CalculateScore.calculate(game);		
	}

	@Test(expected=RuntimeException.class)
	public void testRuntimeExceptionGameNull() {
		CalculateScore.calculate(null);		
	}

}
