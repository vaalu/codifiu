/**
 * 
 */
package in.codifi.app.auth.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.codifi.app.auth.config.messages.ApplicationMessages;
import in.codifi.app.auth.dto.CodifiAuthUser;
import in.codifi.app.auth.dto.CodifiMessage;
import in.codifi.app.auth.dto.CodifiUser;
import in.codifi.app.auth.specs.IAuthSpecsService;

/**
 * @author mohup
 *
 */
@ApplicationScoped
public class CodifiAuthServices extends AbstractDefaultUtilServices implements IAuthSpecsService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CodifiAuthServices.class);
	
	@Inject
	ApplicationMessages messages;
	
	@Override
	public CodifiUser addNewUser(CodifiAuthUser authRegistrationUser) {
		
		CodifiUser user = new CodifiUser();
		try {
			externalAuthService.addNewUser(authRegistrationUser);
			user.setEmail(authRegistrationUser.getEmail());
			
		} catch (Exception e) {
			if(e.getMessage() == null || e.getMessage().contains("status code 409")) {
				return logInvalid(user, messages.getGeneralError().getDescription(), e, 409);
			}
			return logInvalid(user, "Unable to add a new user.", e);
		}
		return user;
	}
	
	/**
	 * Utility method to log invalid messages
	 * @param verifyUser
	 * @param msg
	 * @param e
	 * @return
	 */
	private CodifiUser logInvalid(CodifiUser verifyUser, String msg, Throwable e) {
		if(null != e) {
			LOGGER.error(msg, e);
		} else {
			LOGGER.error(msg);
		}
		if(null == verifyUser) {
			verifyUser = new CodifiUser();
		}
		verifyUser.addMessage(messages.getGeneralError());
		verifyUser.setStatus(messages.getGeneralError().getDescription());
		verifyUser.setValid(false);
		return verifyUser;
	}
	/**
	 * Utility method to log invalid messages
	 * @param verifyUser
	 * @param msg
	 * @param e
	 * @param statusCode
	 * @return
	 */
	private CodifiUser logInvalid(CodifiUser verifyUser, String msg, Throwable e, int statusCode) {
		if(null != e) {
			LOGGER.error(msg, e);
		} else {
			LOGGER.error(msg);
		}
		if(null == verifyUser) {
			verifyUser = new CodifiUser();
		}
		CodifiMessage errMsg = messages.getGeneralError();
		verifyUser.addMessage(errMsg);
		verifyUser.setStatus(errMsg.getDescription());
		verifyUser.setValid(false);
		return verifyUser;
	}

}
