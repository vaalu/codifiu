/**
 * 
 */
package in.codifi.app.auth.config.messages;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import in.codifi.app.auth.config.AppMessaagesConfig;
import in.codifi.app.auth.dto.CodifiMessage;

/**
 * @author mohup
 *
 */
@ApplicationScoped
public class ApplicationMessages {

	@Inject
	AppMessaagesConfig messagesConfig;
	
	/**
	 * @param type
	 * @param code
	 * @return int :: message code
	 */
	private int getMessageCode(MessageTypes type, int code) {
		return Integer.parseInt(String.format("%d%d", type.getCode(), code));
	}
	/**
	 * @param type
	 * @param code
	 * @param description
	 * @return {@link CodifiMessage}
	 */
	private CodifiMessage getMessage(MessageTypes type, int code, String description) {
		CodifiMessage message = new CodifiMessage();
		int messageCode = getMessageCode(type, code);
		message.setCode(messageCode);
		message.setDescription(description);
		return message;
	}
	/**
	 * General error message
	 * @return {@link CodifiMessage}
	 */
	public CodifiMessage getGeneralError() {
		return getMessage(MessageTypes.ERROR, 0, messagesConfig.getGeneralError());
	}
	/**
	 * Message for successful user registration
	 * @return {@link CodifiMessage}
	 */
	public CodifiMessage getValidUser() {
		return getMessage(MessageTypes.INFO, 2, messagesConfig.getValidUser());
	}
}
