package com.skat.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Frame {
	private List<Integer> points = new ArrayList<Integer>();
	private int score = -1;

	public List<Integer> getPoints() {
		return points;
	}
	public void setPoints(List<Integer> points) {
		this.points = points;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean isStrike() {
		if (points.get(0).intValue() == 10)
			return true;
		else
			return false;
	}
	
	public boolean isSpare() {
		if (isStrike())
			return false;
		if ((points.get(0).intValue() + points.get(1).intValue()) == 10)
			return true;
		else
			return false;
	}
	
}
