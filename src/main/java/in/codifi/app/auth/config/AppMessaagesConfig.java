/**
 * 
 */
package in.codifi.app.auth.config;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author mohup
 *
 */
@ApplicationScoped
public class AppMessaagesConfig {

	@ConfigProperty(name="en.auth.messages.general.error")
	private String generalError;
	@ConfigProperty(name="en.auth.messages.info.valid.user")
	private String validUser;

	/**
	 * @return the generalError
	 */
	public String getGeneralError() {
		return generalError;
	}

	/**
	 * @param generalError the generalError to set
	 */
	public void setGeneralError(String generalError) {
		this.generalError = generalError;
	}

	/**
	 * @return the validUser
	 */
	public String getValidUser() {
		return validUser;
	}

	/**
	 * @param validUser the validUser to set
	 */
	public void setValidUser(String validUser) {
		this.validUser = validUser;
	}

}
