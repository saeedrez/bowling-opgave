/**
 * 
 */
package com.skat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The calculated score that is submitted to url for verification
 * @author Saeed Rezaiyeh
 * Version 1.0
 *
 */
public class ResultForm {

	String token;
	List<Integer> points = new ArrayList<Integer>();
	
	public List<Integer> getPoints() {
		return points;
	}
	public void setPoints(List<Integer> points) {
		this.points = points;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
