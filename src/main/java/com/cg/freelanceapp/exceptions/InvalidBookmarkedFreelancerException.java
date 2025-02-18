package com.cg.freelanceapp.exceptions;

/**************************************************************************************
 * Description : Invalid Bookmarked Freelancer Exception class.
 * Version     : v1.0.0
 *************************************************************************************/
public class InvalidBookmarkedFreelancerException extends RuntimeException {

	private static final long serialVersionUID = -397062827051951364L;

	public InvalidBookmarkedFreelancerException() {
		super();
	}

	public InvalidBookmarkedFreelancerException(String message) {
		super(message);
	}

}
