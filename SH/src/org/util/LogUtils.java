package org.util;

import org.apache.log4j.Logger;

public class LogUtils {

	private static Logger logger;

	static {
		logger = Logger.getLogger(LogUtils.class);
	}

	public static void addInfo(String message) {
		logger.info(message);
	}

	public static void addError(String message) {
		logger.error(message);
	}

}
