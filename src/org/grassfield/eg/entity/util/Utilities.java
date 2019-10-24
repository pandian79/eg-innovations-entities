package org.grassfield.eg.entity.util;

import org.apache.commons.validator.routines.InetAddressValidator;

/**
 * Utilities
 * @author Ramaiah Murugapandian
 *
 */
public class Utilities {

	/**
	 * Check if the given text is a valid IP
	 * @param ip IP in text format
	 * @return
	 */
	public static boolean isIp(String ip) {
		return InetAddressValidator.getInstance().isValid(ip);
	}

}
