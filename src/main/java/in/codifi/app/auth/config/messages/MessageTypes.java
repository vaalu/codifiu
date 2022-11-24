/**
 * 
 */
package in.codifi.app.auth.config.messages;

/**
 * @author mohup
 *
 */
public enum MessageTypes {
	INFO(200),
	ERROR(400);
	
	private MessageTypes(int code) {
		this.code = code;
	}
	
	private int code;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
}
