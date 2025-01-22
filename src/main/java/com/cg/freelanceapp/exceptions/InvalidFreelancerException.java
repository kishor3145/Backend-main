package com.cg.freelanceapp.exceptions;

/**************************************************************************************
 * Description : Invalid Freelancer Exception class.
 * Version     : v1.0.0
 *************************************************************************************/
public class InvalidFreelancerException extends RuntimeException {

	private static final long serialVersionUID = -5601025445317923191L;

	public InvalidFreelancerException() {
		super();
	}

	public InvalidFreelancerException(String msg) {
		super(msg);
	}
}
