package com.skat.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GamePoints {
	
	public static final int MAX_FRAMES = 10;
	public static final int MAX_PINS = 10;
	
	public List<Frame> points = new ArrayList<Frame>();
	public String token;	
				
	public List<Frame> getPoints() {
		return points;
	}
	public void setPoints(List<Frame> points) {
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
		String str = "";
		for (Frame frame : points) {
			
//			System.out.println("==> points.size: " + points.size());
			
			str += "[";
			for (int i = 0; i < frame.getPoints().size(); i++) {
				str += frame.getPoints().get(i); 
				if (i<frame.getPoints().size()-1)
					str += ",";
				else
					str += "], ";
						
			} // for
			str += ": Score: " + frame.getScore();
		} // points
		str += ", token: " + token;
		return str;
	}
}
