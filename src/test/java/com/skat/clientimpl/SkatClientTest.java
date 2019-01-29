package com.skat.clientimpl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.skat.model.GamePoints;

/**
 * @author Saeed Rezaiyeh
 *
 */
public class SkatClientTest {

	@Test
	public void testGetPoints() {
		SkatClient client = new SkatClient();
		GamePoints points = client.getPoints();
		
		System.out.println(points);
		
		assertNotNull(points);
	}

}
