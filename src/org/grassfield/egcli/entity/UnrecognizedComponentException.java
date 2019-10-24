package org.grassfield.egcli.entity;

/**
 * Exception class to be used when unexpected manager details are received
 * @author Ramiah Murugapandian
 *
 */
public class UnrecognizedComponentException extends RuntimeException {

	public UnrecognizedComponentException(String string) {
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
