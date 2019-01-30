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
	private int errorCode;
	
	public GameException(String message, int code) {
        super(message + code);
		errorCode = code;
    }

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
