package com.skat.model;

import java.util.ArrayList;
import java.util.List;

public class ClientGamePoints {

	// public int[][] points;
//	public List<int[]> points = new ArrayList<int[]>();
	
//	public List<FramePoints> points = new ArrayList<FramePoints>();
//	public List<List<Integer>> points = new ArrayList<List<Integer>>();
//	public List<Integer> points = new ArrayList<Integer>();
//	public List<int[]> points = new ArrayList<int[]>();
	
	public List<List<Integer>> points = 
			new ArrayList<List<Integer>>();
	public String token;
	
	public List<List<Integer>> getPoints() {
		return points;
	}
	public void setPoints(List<List<Integer>> points) {
		this.points = points;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}	

	@Override
	public String toString() {
		return "clientGamePoints.size: " + points.size() + "   first element size: " +
				points.get(0).size();
	}
}
