package com.skat.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VerificationResult {
	private boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
