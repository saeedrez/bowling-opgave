package com.skat.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.skat.model.ClientGamePoints;
import com.skat.model.Frame;
import com.skat.model.GamePoints;
import com.skat.model.ResultForm;

public class DataConversionUtil {
	
	public static GamePoints convert(ClientGamePoints clientGamePoints) {
		GamePoints gamePoints = new GamePoints();
		
		gamePoints.setToken(clientGamePoints.getToken());
		
		// map data from client to domain
		for (List<Integer> points : clientGamePoints.getPoints()) {
			Frame frame = new Frame();
			for (Integer point : points) {
				frame.getPoints().add(point);
			}
			gamePoints.getPoints().add(frame);
		}
		
		return gamePoints;
	}

	public static ClientGamePoints parseResponse(String response) {
		ClientGamePoints clientGamePoints = new ClientGamePoints();
		
		// we have token first
		
        Pattern p = Pattern.compile("\\d+");
        String[] subs = response.split("\"token\":");
        String token = subs[1].substring(subs[1].indexOf("\"")+1);
        
        token = token.substring(0, token.indexOf("\""));
        clientGamePoints.setToken(token);
        
        System.out.println("token: " + token);
        Matcher m = p.matcher(subs[0]);
        List<Integer> intList = new ArrayList<Integer>();
        while(m.find()) {
            intList.add(Integer.parseInt(m.group()));
        }

        // map parsed data to clientGamePoints
        for (int k=0, i=0; i<intList.size();i++, k++) {
    		List<Integer> alist = new ArrayList<Integer>();
    		clientGamePoints.getPoints().add(alist);
        	for (int j=0;j<2;j++) {
        		clientGamePoints.getPoints().get(k).add(intList.get(i+j));
        	}
        	i++;
        }
        return clientGamePoints;
	}
	
	public static ResultForm getScores(GamePoints game) {
		ResultForm result = new ResultForm();

		result.setToken(game.getToken());
		for (Frame frame : game.getPoints()) {
			result.getPoints().add(frame.getScore());
		}
				
		return result;
	}
}
