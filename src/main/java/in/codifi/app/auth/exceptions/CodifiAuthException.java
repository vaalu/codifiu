/**
 * 
 */
package in.codifi.app.auth.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.codifi.app.auth.config.AuthActions;

/**
 * @author mohup
 *
 */
public class CodifiAuthException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(CodifiAuthException.class);

	public CodifiAuthException() {
		super();
	}

	public CodifiAuthException(String message) {
		super(message);
		LOGGER.error(message);
	}
	
	public CodifiAuthException(String message, Throwable exception) {
		super(message, exception);
		LOGGER.error(message, exception);
	}

	public CodifiAuthException(AuthActions action, Throwable exception, int statusCode) {
		super(action.getDescription(), exception);
		LOGGER.error(action.getDescription(), exception);
	}

}
