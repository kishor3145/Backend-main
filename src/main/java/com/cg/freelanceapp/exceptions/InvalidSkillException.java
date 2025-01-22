package com.cg.freelanceapp.exceptions;

/**************************************************************************************
 * Description : Invalid Skill Exception class
 * Version     : v1.0.0
 *************************************************************************************/
public class InvalidSkillException extends RuntimeException {

	private static final long serialVersionUID = -1840953501707991093L;

	public InvalidSkillException() {
		super();
	}

	public InvalidSkillException(String message) {
		super(message);
	}

}
