/**
 * 
 */
package com.skat.exceptions;

/**
 * Bowling gamePoints Exception
 * @author Saeed Rezaiyeh
 *
 */
public class GameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public GameException(String message) {
            super(message);
    }
	
}
