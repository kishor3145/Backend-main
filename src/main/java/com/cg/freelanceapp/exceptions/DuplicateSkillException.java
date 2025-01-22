package com.cg.freelanceapp.exceptions;

/**************************************************************************************
 * Description : Invalid Skill Exception class
 * Version     : v1.0.0
 *************************************************************************************/
public class DuplicateSkillException extends RuntimeException {

	private static final long serialVersionUID = -8415532512576546747L;

	public DuplicateSkillException() {
		super();
	}

	public DuplicateSkillException(String message) {
		super(message);
	}

}
