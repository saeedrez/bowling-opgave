package com.skat.utils;

import com.skat.model.Frame;
import com.skat.model.GamePoints;

/**
 * Mock data for testing
 * @author Saeed Rezaiyeh
 * @version 1.0
 *
 */
public class MockGamePoints {

	public static GamePoints getMockGamePointsAllStrikes() {
		GamePoints gamePoints = new GamePoints();

		Frame frame;
		for (int i = 0; i < 9; i++) {
			frame = new Frame();
			frame.getPoints().add(10);
			frame.getPoints().add(0);			
			gamePoints.getPoints().add(frame);
		}

		frame = new Frame();
		frame.getPoints().add(10);
		frame.getPoints().add(3);			
		frame.getPoints().add(4);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("8upVjKF7FV7GMqqBQsz0tXcqM2qMWgCO");
		return gamePoints;
	}	

	public static GamePoints getMockGamePoints1() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(9);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(7);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(1);
		frame.getPoints().add(8);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(8);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(2);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(8);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("SZShRYFAzQLBwWrJwCih9JOaOoYx9mMa");
		return gamePoints;
	}
	
	public static GamePoints getMockGamePoints2() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(8);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(5);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(9);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(0);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(4);
		frame.getPoints().add(4);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("XXgCB4BOFuR2cajKDd6g3gP0QauQUBJb");
		return gamePoints;
	}	
	
	public static GamePoints getMockGamePoints3() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(5);
		frame.getPoints().add(4);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(0);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(8);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("9RnLyHSTGDlUpbSZO8VX15DmOanOztCz");
		return gamePoints;
	}	


	public static GamePoints getMockGamePoints4() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(6);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(5);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(0);
		frame.getPoints().add(6);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(1);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(6);
		frame.getPoints().add(3);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(6);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(4);
		frame.getPoints().add(6);			
		gamePoints.getPoints().add(frame);

		gamePoints.setToken("RXsBj8zmjtw0jHaEgGYYnVL4v8vlpBrU");
		return gamePoints;
	}	

	public static GamePoints getMockGamePoints5() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(0);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(2);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);

		gamePoints.setToken("JOrDp66uLdXnPKuNHz9XYtyUNKKlXYAC");
		return gamePoints;
	}	

	public static GamePoints getMockGamePoints6() {
		GamePoints gamePoints = new GamePoints();
				
		Frame frame = new Frame();
		frame.getPoints().add(9);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(9);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(7);
		frame.getPoints().add(1);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(3);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(8);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);
		
		frame = new Frame();
		frame.getPoints().add(10);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);

		frame = new Frame();
		frame.getPoints().add(1);
		frame.getPoints().add(0);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("xY6jt41bP9sFL2mt5iBMBYOGxEdHZeJ4");
		return gamePoints;
	}

	public static GamePoints getMockInvalidGamePoints() {
		GamePoints gamePoints = new GamePoints();
		
		// bad input data: 11 pins
		Frame frame = new Frame();
		frame.getPoints().add(9);
		frame.getPoints().add(2);			
		gamePoints.getPoints().add(frame);
		
		gamePoints.setToken("xY6jt41bP9sFL2mt5iBMBYOGxEdHZeJ4");
		return gamePoints;	}	

}
