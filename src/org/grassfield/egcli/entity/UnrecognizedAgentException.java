package org.grassfield.egcli.entity;

/**
 * Exception class to be used when unexpected agent details are received
 * @author Ramaiah Murugapandian
 *
 */
public class UnrecognizedAgentException extends RuntimeException {

	public UnrecognizedAgentException(String string) {
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
