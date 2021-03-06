package com.skat.clientimpl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.skat.exceptions.GameException;
import com.skat.model.GamePoints;
import com.skat.model.ResultForm;
import com.skat.model.VerificationResult;
import com.skat.utils.DataConversionUtil;

/**
 * Rest client for connections to skat
 * @author Saeed Rezaiyeh
 * Version 1.0
 */
public class SkatClient {

	private Client client;
	private final String SKAT_POINTS_ENDPOINT_URL = "http://13.74.31.101/api/points";
	
	public SkatClient() {
		client = ClientBuilder.newClient();
	}

	public GamePoints getPoints() {
		WebTarget endpoint = client.target(SKAT_POINTS_ENDPOINT_URL);
		String response = endpoint.request(MediaType.APPLICATION_JSON)
				.get(String.class);
		
		return DataConversionUtil.convert(DataConversionUtil.parseResponse(response));
	}

	// submit result for verification
	public VerificationResult submitResult(GamePoints gamePoints) throws GameException {
		WebTarget endpoint = client.target(SKAT_POINTS_ENDPOINT_URL);

		ResultForm resultForm = DataConversionUtil.getScores(gamePoints);
		Response response = endpoint.request(MediaType.APPLICATION_JSON)
				.post(Entity.entity(resultForm, MediaType.APPLICATION_JSON));
		
		if (response.getStatus() != 200) {
			throw new GameException("Result verification failed: ", response.getStatus());
		}
		return response.readEntity(VerificationResult.class);
	}

}
