/**
 * 
 */
package com.skat.business;

import javax.ws.rs.core.Response;

import com.skat.exceptions.GameException;
import com.skat.model.Frame;
import com.skat.model.GamePoints;

/**
 * Algorithm to calculate scores for each frame in the bowling gamePoints
 * @author saeed Rezaiyeh
 * @version 1.0
*/
public class CalculateScore {
	
	public static void calculate(GamePoints game) throws GameException {
		int score = -1;
		Frame currentFrame, nextFrame, nextNextFrame, previousFrame;
		
		if (game == null) {
			throw new GameException("gamePoints: input data is missing", Response.Status.BAD_REQUEST.getStatusCode());
		}
		
		int gameSize = (game.getPoints().size() > GamePoints.MAX_FRAMES ? 
				GamePoints.MAX_FRAMES : game.getPoints().size());

		for (int i = 0; i < game.getPoints().size(); i++) {
			currentFrame = game.getPoints().get(i);
			previousFrame = (i > 0 ? game.getPoints().get(i-1) : null);
			nextFrame = (i < (gameSize-1) ? game.getPoints().get(i+1) : null);
			nextNextFrame = (i < (gameSize-2) ? game.getPoints().get(i+2) : null);
			
			if ((i<gameSize-1) 
					&& (currentFrame.getPoints().get(0) + currentFrame.getPoints().get(1) > GamePoints.MAX_PINS)) {
				throw new GameException("Wrong number of pins (can be max 10): " + 
						currentFrame.getPoints().get(0) + ", " + currentFrame.getPoints().get(1), 
						Response.Status.BAD_REQUEST.getStatusCode());
			}
			
			// go thru each frame and calculate score for the frame
			if (currentFrame.isStrike()) {
				score = 10; 
				if (nextFrame != null) {
					if (nextFrame.isStrike() == false)
						score += nextFrame.getPoints().get(0) + nextFrame.getPoints().get(1);
					else { // next is also strike
						score += 10;
						
						if (nextNextFrame != null) {
							if (nextNextFrame.isStrike() == false)
								score += nextNextFrame.getPoints().get(0);
							else 
								score += 10;			
						} else {
							score += 10;
						}

					}
					
				} else { // currentFrame is the last frame
					score += currentFrame.getPoints().get(1);
					if (currentFrame.getPoints().size() > 2)
						score += currentFrame.getPoints().get(2);
				}
								
				if (previousFrame != null)
					score += previousFrame.getScore();
				currentFrame.setScore(score);
			} else if (currentFrame.isSpare()) {
				// if last frame is spare, add all 3 numbers
				score = currentFrame.getPoints().get(0) + currentFrame.getPoints().get(1) +
						(nextFrame != null ? nextFrame.getPoints().get(0): 
							(currentFrame.getPoints().size()>2 ? currentFrame.getPoints().get(2) : 0)) +
						(previousFrame != null ? previousFrame.getScore() : 0);
				currentFrame.setScore(score);
			} else {
				score = currentFrame.getPoints().get(0) + currentFrame.getPoints().get(1) + 
						(previousFrame != null ? previousFrame.getScore() : 0);
				currentFrame.setScore(score);
			}
			
		}		
	}
}
