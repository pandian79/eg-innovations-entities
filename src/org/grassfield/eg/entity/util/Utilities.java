package org.grassfield.eg.entity.util;

import org.apache.commons.validator.routines.InetAddressValidator;

public class Utilities {

	public static boolean isIp(String tok) {
		return InetAddressValidator.getInstance().isValid(tok);
	}

}
