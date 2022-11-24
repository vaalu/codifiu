/**
 * 
 */
package in.codifi.app.auth.services;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.codifi.app.auth.config.PropertiesConfig;
import in.codifi.app.auth.exceptions.CodifiAuthException;

/**
 * @author mohup
 *
 */
public abstract class AbstractDefaultUtilServices {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractDefaultUtilServices.class);
	
	@Inject
	PropertiesConfig props;
	
	@Inject
	CodifiExternalAuthServices externalAuthService;
	
	protected String getToken() throws CodifiAuthException {
		LOGGER.debug("Fetching token for authentication");
		return externalAuthService.getToken();
	}
}
